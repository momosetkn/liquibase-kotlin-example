package typesafechangelogs

import momosetkn.liquibase.kotlin.parser.KotlinTypesafeDatabaseChangeLog

class DatabaseChangelogAll : KotlinTypesafeDatabaseChangeLog({
    // if you use includeAll instead include, please use bellow comment-out code.
//    includeAll("scriptchangelogs/main/")
    include("scriptchangelogs/db.changelog-all.kts")
    includeAll("typesafechangelogs.main")
})
