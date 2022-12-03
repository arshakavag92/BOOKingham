pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
//rootProject.name = "BOOKingham"
//include ':app'
//include ':audio'
//include ':core'
//include ':reader'

rootProject.name = "BOOKingham"
include(":app", ":audio", ":core", ":reader")