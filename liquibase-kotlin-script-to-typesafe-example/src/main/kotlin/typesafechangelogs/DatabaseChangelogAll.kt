package typesafechangelogs

import momosetkn.liquibase.kotlin.parser.KotlinTypesafeDatabaseChangeLog

class DatabaseChangelogAll : KotlinTypesafeDatabaseChangeLog({
    includeAll("typesafechangelogs.main")
})
