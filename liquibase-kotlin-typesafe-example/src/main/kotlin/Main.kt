fun main() {
    val connectionUrl = "jdbc:mysql://localhost:3316"
    val username = "root"
    val password = ""
    Class.forName("com.mysql.cj.jdbc.Driver")
    java.sql.DriverManager.getConnection(connectionUrl, username, password).use { connection ->
        connection.createStatement().use { statement ->
            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS test")
        }
    }
    momosetkn.liquibase.client.LiquibaseClient.update(
        driver = "com.mysql.cj.jdbc.Driver",
        url = "$connectionUrl/test",
        username = username,
        password = password,
        changelogFile = changelogs.DatabaseChangelogAll::class.qualifiedName + ".kt",
    )
    momosetkn.liquibase.client.LiquibaseCommandExecutor.shutdown()
}
