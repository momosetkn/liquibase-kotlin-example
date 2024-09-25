plugins {
    kotlin("jvm") version "2.0.20"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    application
}

group = "momosetkn"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

application {
    mainClass = "MainKt"
}

dependencies {
    implementation("org.liquibase:liquibase-core:4.29.2")
    implementation("com.mysql:mysql-connector-j:9.0.0")
    implementation("org.slf4j:slf4j-simple:2.0.16")

    val liquibaseKotlinVersion = "0.6.0"
    implementation("com.github.momosetkn.liquibase-kotlin:liquibase-kotlin-dsl:$liquibaseKotlinVersion")
    implementation("com.github.momosetkn.liquibase-kotlin:liquibase-kotlin-client:$liquibaseKotlinVersion")
    // compiled
    implementation("com.github.momosetkn.liquibase-kotlin:liquibase-kotlin-compiled-parser:$liquibaseKotlinVersion")
    implementation("com.github.momosetkn.liquibase-kotlin:liquibase-kotlin-compiled-serializer:$liquibaseKotlinVersion")
    // script
    implementation("com.github.momosetkn.liquibase-kotlin:liquibase-kotlin-script-parser:$liquibaseKotlinVersion")
    implementation("com.github.momosetkn.liquibase-kotlin:liquibase-kotlin-script-serializer:$liquibaseKotlinVersion")

}

// if you want to use multiple liquibase-parser, add bellow code.
tasks {
    withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
        mergeServiceFiles()
    }
}
