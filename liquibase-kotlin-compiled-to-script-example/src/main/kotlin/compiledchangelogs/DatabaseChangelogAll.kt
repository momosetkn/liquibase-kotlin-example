package compiledchangelogs

import momosetkn.liquibase.kotlin.parser.KotlinCompiledDatabaseChangeLog

class DatabaseChangelogAll : KotlinCompiledDatabaseChangeLog({
    // if you use includeAll instead include, please use bellow comment-out code.
//    includeAll("scriptchangelogs/main/")
    include("scriptchangelogs/db.changelog-all.kts")
    includeAll("compiledchangelogs.main")
})
