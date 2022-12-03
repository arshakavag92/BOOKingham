import org.gradle.api.artifacts.dsl.DependencyHandler

object AppDependencies {
    //std lib
    val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    //android ui
    private val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    private val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    private val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    //androidx libraries
    private val androidx_core = "androidx.core:core-ktx:${Versions.core_version}"
    private val androidx_lifecycle =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_version}"
    private val androidx_activity_compose =
        "androidx.activity:activity-compose:${Versions.activity_compose_version}"
    private val androidx_compose_ui = "androidx.compose.ui:ui:${Versions.compose_version}"
    private val androidx_compose_ui_tooling =
        "androidx.compose.ui:ui-tooling-preview:${Versions.compose_version}"
    private val androidx_compose_material_3 =
        "androidx.compose.material3:material3:${Versions.ompose_material_version}"
    private val androidx_ui_tooling_manifest =
        "androidx.compose.ui:ui-test-manifest:${Versions.compose_version}"

    //test libs
    private val junit = "junit:junit:${Versions.junit}"
    private val extJUnit = "androidx.test.ext:junit:${Versions.extJunit}"
    private val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    private val ui_test_espresso = "androidx.compose.ui:ui-test-junit4:${Versions.espresso}"

    val appLibraries = arrayListOf<String>().apply {
        add(kotlinStdLib)
        add(coreKtx)
        add(appcompat)
        add(constraintLayout)
    }

    val androidxLibraries = arrayListOf<String>().apply {
        add(androidx_core)
        add(androidx_lifecycle)
        add(androidx_activity_compose)
        add(androidx_compose_ui)
        add(androidx_compose_ui_tooling)
        add(androidx_compose_material_3)
    }

    val androidTestLibraries = arrayListOf<String>().apply {
        add(extJUnit)
        add(espressoCore)
        add(ui_test_espresso)
    }

    val testLibraries = arrayListOf<String>().apply {
        add(junit)
    }

    val debugLibraries = arrayListOf<String>().apply {
        add(androidx_compose_ui_tooling)
        add(androidx_ui_tooling_manifest)
    }
}

//util functions for adding the different type dependencies from build.gradle file
fun DependencyHandler.kapt(list: List<String>) {
    list.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.implementation(list: List<String>) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.androidTestImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("androidTestImplementation", dependency)
    }
}

fun DependencyHandler.testImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("testImplementation", dependency)
    }
}

fun DependencyHandler.debugImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("debugImplementation", dependency)
    }
}

fun DependencyHandler.api(list: List<String>) {
    list.forEach { dependency ->
        add("api", dependency)
    }
}

fun DependencyHandler.testApi(list: List<String>) {
    list.forEach { dependency ->
        add("testApi", dependency)
    }
}