/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":debezium-api"))
    api(project(":debezium-core"))
    compileOnly(libs.org.slf4j.slf4j.api)
    compileOnly(libs.org.apache.kafka.connect.api)
}

description = "Debezium Storage File Module"

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier = "tests"
    from(sourceSets["test"].output)
}

(publishing.publications["maven"] as MavenPublication).artifact(testsJar)
