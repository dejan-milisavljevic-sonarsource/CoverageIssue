plugins {
    id("java")
    id("jacoco")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    testImplementation ("org.assertj:assertj-core:3.24.1")
    testImplementation ("org.mockito:mockito-core:4.8.1")
    testImplementation ("org.mockito:mockito-junit-jupiter:4.8.1")
}

jacoco {
    toolVersion = "0.8.10"
}

tasks.jacocoTestReport {

}
tasks.withType<JacocoReport> {
    reports {
        xml.required.set(true)
        csv.required.set(true)
        html.required.set(true)
    }
}
tasks.test {
    useJUnitPlatform()
}
