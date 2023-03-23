buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

// The errors shown here are an AS bug https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins {
    id("org.jetbrains.kotlin.android") version "1.7.21" apply false
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.android.application) apply false
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.kotlin.jvm) apply false
    @Suppress("DSL_SCOPE_VIOLATION")
    alias(libs.plugins.google.services) apply false
}
