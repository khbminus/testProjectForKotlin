pluginManagement {
    val kotlinVersion = "1.7.20"
    plugins {
    }
    repositories {
        mavenLocal()
        mavenCentral()
    }
    plugins {
        id("org.jub.kotlin.compiler.plugin") version "1.0-SNAPSHOT"
        id("org.jetbrains.kotlin.jvm") version kotlinVersion

    }
}
rootProject.name = "testProject"

