databaseChangeLog {
    changeSet(author = "momose (generated)", id = "100-0") {
        tagDatabase("started_script")
    }

    changeSet(author = "momose (generated)", id = "100-10") {
        createTable(tableName = "company_script") {
            column(name = "id", type = "UUID") {
                constraints(nullable = false, primaryKey = true)
            }
            column(name = "name", type = "VARCHAR(256)")
        }
    }
}
