plugins {
    kotlin("jvm") version "2.0.20"
    id("com.github.johnrengelman.shadow") version "8.1.1"
    application
}

group = "momosetkn"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

application {
    mainClass = "MainKt"
}

dependencies {
    implementation("org.liquibase:liquibase-core:4.29.2")
    implementation("com.mysql:mysql-connector-j:9.0.0")
    implementation("org.slf4j:slf4j-simple:2.0.16")

    val liquibaseKotlinVersion = "4.29.2-0.8.0"
    implementation("io.github.momosetkn:liquibase-kotlin-dsl:$liquibaseKotlinVersion")
    implementation("io.github.momosetkn:liquibase-kotlin-client:$liquibaseKotlinVersion")
    // compiled
    implementation("io.github.momosetkn:liquibase-kotlin-compiled-parser:$liquibaseKotlinVersion")
    implementation("io.github.momosetkn:liquibase-kotlin-compiled-serializer:$liquibaseKotlinVersion")
    // script
    implementation("io.github.momosetkn:liquibase-kotlin-script-parser:$liquibaseKotlinVersion")
    implementation("io.github.momosetkn:liquibase-kotlin-script-serializer:$liquibaseKotlinVersion")

}

// if you want to use multiple liquibase-parser, add bellow code.
tasks {
    withType<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar> {
        mergeServiceFiles()
    }
}
