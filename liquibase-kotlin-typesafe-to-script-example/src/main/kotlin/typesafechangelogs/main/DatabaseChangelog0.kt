package typesafechangelogs.main

import momosetkn.liquibase.kotlin.parser.KotlinTypesafeDatabaseChangeLog

class DatabaseChangelog0 : KotlinTypesafeDatabaseChangeLog({
    changeSet(author = "momose (generated)", id = "200-0") {
        tagDatabase("started_typesafe")
    }

    changeSet(author = "momose (generated)", id = "200-10") {
        createTable(tableName = "company_typesafe") {
            column(name = "id", type = "UUID") {
                constraints(nullable = false, primaryKey = true)
            }
            column(name = "name", type = "VARCHAR(256)")
        }
    }
})
