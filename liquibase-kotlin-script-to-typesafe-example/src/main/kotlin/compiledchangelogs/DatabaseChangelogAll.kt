package compiledchangelogs

import momosetkn.liquibase.kotlin.parser.KotlinCompiledDatabaseChangeLog

class DatabaseChangelogAll : KotlinCompiledDatabaseChangeLog({
    includeAll("compiledchangelogs.main")
})
