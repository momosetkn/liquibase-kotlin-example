val kotestVersion: String by project
val kotlinVersion: String by project
val liquibaseVersion: String by project
val artifactIdPrefix: String by project
val liquibaseKotlinVersion: String by project

plugins {
    kotlin("jvm") version "2.0.20"
    `maven-publish`
}

group = "momosetkn"
version = "1.0-SNAPSHOT"
repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}

dependencies {}
