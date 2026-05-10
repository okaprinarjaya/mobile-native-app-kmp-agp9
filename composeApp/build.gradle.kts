import org.jetbrains.kotlin.gradle.dsl.JvmTarget

val koinVersion: String = "4.2.0"

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidMultiplatformLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.kotlinxSerialization)
    alias(libs.plugins.ksp)
    alias(libs.plugins.androidx.room)
}

kotlin {
    listOf(
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "ComposeApp"
            isStatic = true
        }
    }

    room {
        schemaDirectory("$projectDir/schemas")
    }

    android {
        namespace = "com.example.mynolduaapplibrary"
        compileSdk = libs.versions.android.compileSdk.get().toInt()

        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }

        androidResources {
            enable = true
        }
    }
    
    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.foundation)
            implementation(libs.compose.material3)
            implementation(libs.compose.ui)
            implementation(libs.compose.components.resources)
            implementation(libs.compose.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodelCompose)
            implementation(libs.androidx.lifecycle.runtimeCompose)
            implementation(libs.material.icons.extended)

            // Serialization and Coroutines
            implementation(libs.kotlinx.serialization.json)
            implementation(libs.kotlinx.coroutines.core)

            // Navigation
            implementation(libs.navigation.compose)

            // Coil
            implementation(libs.coil.compose)
            implementation(libs.coil.network.ktor)

            // Ktor
            implementation(libs.ktor.client.core)

            // Room and SQLite
            implementation(libs.androidx.room.runtime)
            implementation(libs.androidx.sqlite.bundled)

            // Koin
            implementation(project.dependencies.platform("io.insert-koin:koin-bom:$koinVersion"))
            implementation(libs.insert.koin.koin.core)
            implementation(libs.insert.koin.koin.compose)
            implementation(libs.insert.koin.koin.compose.viewmodel)
            implementation(libs.koin.compose.viewmodel.navigation)
        }
        androidMain.dependencies {
            implementation(libs.insert.koin.koin.android)
            implementation(libs.kotlinx.coroutines.android)
            implementation(libs.ktor.client.okhttp)
            implementation(libs.compose.uiTooling)
        }
        iosMain.dependencies {
            implementation(libs.ktor.client.darwin)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

dependencies {
    add("kspAndroid", libs.androidx.room.compiler)
    add("kspIosSimulatorArm64", libs.androidx.room.compiler)
    add("kspIosArm64", libs.androidx.room.compiler)
}
