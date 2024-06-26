/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(libs.io.quarkus.quarkus.hibernate.orm)
    api(libs.io.quarkus.quarkus.opentelemetry)
    api(project(":debezium-quarkus-outbox-common"))
}

description = "Debezium Quarkus :: Outbox :: Runtime"

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier = "tests"
    from(sourceSets["test"].output)
}

(publishing.publications["maven"] as MavenPublication).artifact(testsJar)
