plugins {
    kotlin("jvm")
}

group = "momosetkn"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    val liquibaseKotlinVersion = "0.3.2"
    // You can choose to install either kotlin-script or kotlin-typesafe.
    // for kotlin-script
    implementation("com.github.momosetkn.liquibase-kotlin:liquibase-kotlin-dsl:$liquibaseKotlinVersion")
    implementation("com.github.momosetkn.liquibase-kotlin:liquibase-kotlin-script-parser:$liquibaseKotlinVersion")
    implementation("com.github.momosetkn.liquibase-kotlin:liquibase-kotlin-script-serializer:$liquibaseKotlinVersion")
    // If you want to use call liquibase-command by kotlin, add the following code.
    implementation("com.github.momosetkn.liquibase-kotlin:liquibase-kotlin-client:$liquibaseKotlinVersion")

    implementation("com.mysql:mysql-connector-j:9.0.0")
    implementation("info.picocli:picocli:4.7.6")


}
