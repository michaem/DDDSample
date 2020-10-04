plugins {
    base
    kotlin("jvm") version "1.4.10"
}

allprojects {
    group = "com.michaem"
    version = "1.0"

    repositories {
        mavenCentral()
        jcenter()
    }
}