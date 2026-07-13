plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 35
    defaultConfig {
        applicationId = "mx.utng.smarthealthmonitor.tv"
        minSdk = 21
        targetSdk = 35
    }
}

dependencies {
    implementation(project(":app"))
