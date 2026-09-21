plugins {
    id("org.jetbrains.intellij.platform") version "2.19.0"
}

group = "dev.luanverdelho"
version = "0.1.1"

repositories {
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdea("2026.2.3")
    }
}