plugins {
    java
}

dependencies {
    implementation("org.tudalgo:fopbot:0.7.1")
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
