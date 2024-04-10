plugins {
    application
    alias(libs.plugins.jetbrainsKotlinJvm)
    kotlin("plugin.serialization") version "1.9.10"
    id("io.ktor.plugin") version "2.3.9"
}

kotlin {
    jvmToolchain(20)
}

application {
    mainClass.set("io.ktor.server.netty.EngineMain")
}

dependencies {
    implementation("io.ktor:ktor-server-core-jvm")
    implementation("io.ktor:ktor-server-netty-jvm")
    implementation(libs.ktor.server.status.pages)
    implementation(libs.ktor.server.config.yaml)
    implementation(libs.logback.classic)
    testImplementation(libs.kotlin.test.junit)
    testImplementation("io.ktor:ktor-server-tests-jvm")
}
