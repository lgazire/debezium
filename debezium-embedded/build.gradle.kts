/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":debezium-core"))
    api(libs.org.slf4j.slf4j.api)
    api(libs.org.apache.kafka.connect.api)
    api(libs.org.apache.kafka.connect.runtime)
    api(libs.org.apache.kafka.connect.json)
    api(libs.org.apache.kafka.connect.file)
    testImplementation(project(":debezium-core"))
    testImplementation(libs.ch.qos.logback.logback.classic)
    testImplementation(libs.junit.junit)
    testImplementation(libs.org.assertj.assertj.core)
    testImplementation(libs.io.confluent.kafka.connect.avro.converter)
    testImplementation(libs.io.apicurio.apicurio.registry.utils.converter)
    testImplementation(libs.org.awaitility.awaitility)
}

description = "Debezium Embedded"

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier = "tests"
    from(sourceSets["test"].output)
}

(publishing.publications["maven"] as MavenPublication).artifact(testsJar)