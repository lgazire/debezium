/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":debezium-core"))
    api(project(":debezium-connector-binlog"))
    api(project(":debezium-storage-kafka"))
    api(project(":debezium-storage-file"))
    api(project(":debezium-ddl-parser"))
    api(libs.com.zendesk.mysql.binlog.connector.java)
    api(libs.com.mysql.mysql.connector.j)
    testImplementation(libs.mil.nga.wkb)
    testImplementation(project(":debezium-core"))
    testImplementation(project(":debezium-connector-binlog"))
    testImplementation(project(":debezium-embedded"))
    testImplementation(project(":debezium-embedded"))
    testImplementation(libs.ch.qos.logback.logback.classic)
    testImplementation(libs.junit.junit)
    testImplementation(libs.org.mockito.mockito.core)
    testImplementation(libs.org.assertj.assertj.core)
    testImplementation(libs.io.confluent.kafka.connect.avro.converter)
    testImplementation(libs.io.apicurio.apicurio.registry.utils.converter)
    testImplementation(libs.org.awaitility.awaitility)
    testImplementation(project(":debezium-testing-testcontainers"))
    testImplementation(libs.org.testcontainers.testcontainers)
    testImplementation(libs.org.testcontainers.mysql)
    testImplementation(libs.io.rest.assured.rest.assured)
    testImplementation(libs.org.apache.kafka.kafka.v2.v13)
    compileOnly(libs.org.apache.kafka.connect.api)
    compileOnly(libs.org.slf4j.slf4j.api)
}

description = "Debezium Connector for MySQL"

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier = "tests"
    from(sourceSets["test"].output)
}

(publishing.publications["maven"] as MavenPublication).artifact(testsJar)
