import java.sql.DriverManager
import kotlin.system.exitProcess

fun main() {
    val connectionUrl = "jdbc:mysql://localhost:3316"
    val username = "root"
    val password = ""
    val databaseName = "liquibase-kotlin-script-example"
    Class.forName("com.mysql.cj.jdbc.Driver")
    DriverManager.getConnection(connectionUrl, username, password).use { connection ->
        connection.createStatement().use { statement ->
            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS `$databaseName`")
        }
    }
    momosetkn.liquibase.client.LiquibaseClient.update(
        driver = "com.mysql.cj.jdbc.Driver",
        url = "$connectionUrl/$databaseName",
        username = username,
        password = password,
        changelogFile = "changelogs/db.changelog-all.kts",
    )
    exitProcess(0) // shutdown for LiquibaseCommandExecutor
}
