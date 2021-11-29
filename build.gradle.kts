plugins {
    java
    kotlin("jvm") version "1.6.0"
    antlr
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.0")

//    testCompile("junit", "junit", "4.12")
    testImplementation("junit", "junit", "4.12")

    // https://mvnrepository.com/artifact/org.antlr/antlr4-runtime
    implementation("org.antlr", "antlr4-runtime", "4.9.3")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = "16"
}
