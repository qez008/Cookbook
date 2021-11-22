plugins {
    java
    kotlin("jvm") version "1.5.31"
    antlr
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

//    testCompile("junit", "junit", "4.12")
    testImplementation("junit", "junit", "4.12")

    // https://mvnrepository.com/artifact/org.antlr/antlr4-runtime
    implementation("org.antlr", "antlr4-runtime", "4.9.3")
}
