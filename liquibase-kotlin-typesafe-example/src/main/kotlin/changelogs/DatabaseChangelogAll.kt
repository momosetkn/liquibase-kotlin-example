package changelogs

import momosetkn.liquibase.kotlin.parser.KotlinTypesafeDatabaseChangeLog

class DatabaseChangelogAll : KotlinTypesafeDatabaseChangeLog({
    includeAll("changelogs.main")
})
