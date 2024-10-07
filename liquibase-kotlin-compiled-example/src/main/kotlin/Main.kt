import momosetkn.liquibase.client.LiquibaseDatabaseFactory
import momosetkn.liquibase.client.configureLiquibase
import java.sql.DriverManager

fun main() {
    val connectionUrl = "jdbc:mysql://localhost:3316"
    val username = "root"
    val password = ""
    val databaseName = "liquibase-kotlin-compiled-example" + System.currentTimeMillis()
    Class.forName("com.mysql.cj.jdbc.Driver")
    DriverManager.getConnection(connectionUrl, username, password).use { connection ->
        connection.createStatement().use { statement ->
            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS `$databaseName`")
        }
    }
    configureLiquibase {
        global {
            general {
                showBanner = false
            }
        }
    }
    val database = LiquibaseDatabaseFactory.create(
        driver = "com.mysql.cj.jdbc.Driver",
        url = "$connectionUrl/$databaseName",
        username = username,
        password = password,
    )
    val client = momosetkn.liquibase.client.LiquibaseClient(
        changeLogFile = compiledchangelogs.DatabaseChangelogAll::class.qualifiedName!!,
        database = database,
    )
    client.update()

}
