/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":debezium-testing-testcontainers"))
    api(libs.io.fabric8.openshift.client)
    api(libs.commons.codec.commons.codec)
    api(libs.org.apache.commons.commons.compress)
    api(libs.org.apache.kafka.kafka.clients)
    api(libs.org.apache.kafka.connect.api)
    api(libs.org.apache.kafka.connect.runtime)
    api(libs.io.strimzi.api)
    api(libs.io.apicurio.apicurio.registry.operator.api.model)
    api(libs.com.squareup.okhttp3.okhttp)
    api(libs.com.squareup.okhttp3.logging.interceptor)
    api(libs.com.fasterxml.jackson.core.jackson.core)
    api(libs.com.fasterxml.jackson.core.jackson.databind)
    api(libs.io.github.jcechace.fixture5)
    api(libs.org.awaitility.awaitility)
    api(libs.com.mysql.mysql.connector.j)
    api(libs.org.postgresql.postgresql)
    api(libs.com.microsoft.sqlserver.mssql.jdbc)
    api(libs.org.mongodb.mongodb.driver.sync)
    api(libs.com.ibm.db2.jcc)
    api(libs.org.testcontainers.testcontainers)
    api(libs.org.testcontainers.mysql)
    api(libs.org.testcontainers.mongodb)
    api(libs.org.testcontainers.postgresql)
    api(libs.org.testcontainers.mssqlserver)
    api(libs.org.testcontainers.db2)
    api(libs.org.testcontainers.oracle.xe)
    api(libs.org.freemarker.freemarker)
    api(libs.org.bouncycastle.bcpkix.jdk15on)
    testImplementation(libs.org.junit.jupiter.junit.jupiter)
    testImplementation(libs.org.junit.platform.junit.platform.launcher)
    testImplementation(libs.org.assertj.assertj.core)
    testImplementation(libs.ch.qos.logback.logback.classic)
    testImplementation(libs.io.debezium.debezium.connector.jdbc)
    compileOnly(libs.org.testcontainers.jdbc)
}

description = "Debezium system integration test-suite"

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier = "tests"
    from(sourceSets["test"].output)
}

(publishing.publications["maven"] as MavenPublication).artifact(testsJar)
