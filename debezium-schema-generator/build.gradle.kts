/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":debezium-core"))
    api(project(":debezium-storage-kafka"))
    api(libs.org.apache.kafka.kafka.clients)
    api(libs.org.apache.kafka.connect.api)
    api(libs.io.smallrye.smallrye.open.api.core)
    api(libs.org.eclipse.aether.aether.util)
    testImplementation(libs.junit.junit)
    compileOnly(libs.org.apache.maven.maven.plugin.api)
    compileOnly(libs.org.apache.maven.plugin.tools.maven.plugin.annotations)
    compileOnly(libs.org.apache.maven.maven.core)
}

description = "Debezium Schema Generator"

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier = "tests"
    from(sourceSets["test"].output)
}

(publishing.publications["maven"] as MavenPublication).artifact(testsJar)