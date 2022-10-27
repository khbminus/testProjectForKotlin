import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val kotlinVersion = "1.7.20"
    kotlin("jvm") version kotlinVersion
    application
    id("com.bnorm.template.kotlin-ir-plugin") version "0.1.0-SNAPSHOT"
}

template {
    stringProperty.set("a")
}

group = "me.khbminus"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
//        freeCompilerArgs += ("-Xplugin=/home/khbminus/jub/hws/kotlin-jb/kotlin-homework-optional-compiler-khbminus/shallowsize-plugin/build/libs/shallowsize-plugin-1.0-SNAPSHOT.jar")
    }
}

application {
    mainClass.set("MainKt")
}