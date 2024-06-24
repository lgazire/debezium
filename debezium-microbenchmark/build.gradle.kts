/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":debezium-core"))
    api(project(":debezium-scripting"))
    api(project(":debezium-connector-mysql"))
    api(libs.org.slf4j.slf4j.api)
    api(libs.org.openjdk.jmh.jmh.core)
    api(libs.org.openjdk.jmh.jmh.generator.annprocess)
    api(libs.org.apache.kafka.connect.api)
    api(libs.org.apache.groovy.groovy)
    api(libs.org.apache.groovy.groovy.jsr223)
    api(libs.org.graalvm.js.js)
    api(libs.org.graalvm.js.js.scriptengine)
    testImplementation(libs.ch.qos.logback.logback.classic)
}

description = "Debezium Microbenchmark Tests"

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier = "tests"
    from(sourceSets["test"].output)
}

(publishing.publications["maven"] as MavenPublication).artifact(testsJar)
