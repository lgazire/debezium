/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":debezium-microbenchmark"))
    api(project(":debezium-embedded"))
    api(project(":debezium-connector-oracle"))
    api(libs.org.awaitility.awaitility)
    api(libs.com.oracle.database.jdbc.ojdbc8)
}

description = "Debezium Oracle Connector Microbenchmark Tests"

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier = "tests"
    from(sourceSets["test"].output)
}

(publishing.publications["maven"] as MavenPublication).artifact(testsJar)