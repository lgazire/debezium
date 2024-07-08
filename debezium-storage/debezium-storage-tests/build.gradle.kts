/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":debezium-core"))
    api(libs.org.easytesting.fest.assert)
    api(libs.com.azure.azure.storage.blob)
    testImplementation(project(":debezium-api"))
    testImplementation(project(":debezium-ddl-parser"))
    testImplementation(libs.org.slf4j.slf4j.api)
    testImplementation(libs.org.apache.kafka.connect.api)
    testImplementation(libs.ch.qos.logback.logback.classic)
    testImplementation(libs.junit.junit)
    testImplementation(libs.org.assertj.assertj.core)
    testImplementation(project(":debezium-storage-s3"))
    testImplementation(project(":debezium-storage-azure-blob"))
    testImplementation(project(":debezium-connector-mysql"))
    testImplementation(libs.software.amazon.awssdk.s3)
    testImplementation(libs.com.adobe.testing.s3mock.testcontainers)
}

description = "Debezium Storage Tests Module"

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier = "tests"
    from(sourceSets["test"].output)
}

(publishing.publications["maven"] as MavenPublication).artifact(testsJar)