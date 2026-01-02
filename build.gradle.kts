plugins {
    kotlin("jvm") version "1.9.10"
}

group = "com.izhan"
version = "1.0"

repositories {
    mavenCentral()
}

tasks.register<Jar>("kotlinAndroidJar") {
    archiveBaseName.set("convertanumbertoalengthstring-kotlin-android")
    archiveVersion.set(version.toString())
    from(sourceSets.main.get().allSource.filter { it.extension == "kt" })
}
