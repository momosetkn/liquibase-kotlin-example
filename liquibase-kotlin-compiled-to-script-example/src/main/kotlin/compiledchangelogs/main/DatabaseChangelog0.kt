package compiledchangelogs.main

import momosetkn.liquibase.kotlin.parser.KotlinCompiledDatabaseChangeLog

class DatabaseChangelog0 : KotlinCompiledDatabaseChangeLog({
    changeSet(author = "momose (generated)", id = "200-0") {
        tagDatabase("started_compiled")
    }

    changeSet(author = "momose (generated)", id = "200-10") {
        createTable(tableName = "company_compiled") {
            column(name = "id", type = "UUID") {
                constraints(nullable = false, primaryKey = true)
            }
            column(name = "name", type = "VARCHAR(256)")
        }
    }
})
