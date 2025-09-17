plugins {
    id("org.springframework.boot") version "3.2.3"        // Boot 플러그인
    id("io.spring.dependency-management") version "1.1.4" // 의존성 관리
    kotlin("jvm") version "2.2.0"
    kotlin("plugin.spring") version "2.2.0"
    kotlin("plugin.jpa") version "2.2.0"                  // JPA/Kotlin 지원
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // JPA & Hibernate
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")

    // DB 드라이버 (MySQL 예시)
    runtimeOnly("com.mysql:mysql-connector-j")

    // 테스트
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.2")
    testImplementation(kotlin("test"))
}


tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}