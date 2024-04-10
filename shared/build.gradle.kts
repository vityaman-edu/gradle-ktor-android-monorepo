plugins {
    alias(libs.plugins.jetbrainsKotlinJvm) 
    `java-library` 
}

kotlin {
    jvmToolchain(20)
}
