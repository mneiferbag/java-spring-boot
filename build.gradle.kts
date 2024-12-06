plugins {
    java
    id("org.springframework.boot") version "2.6.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
}
java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
group = "eu.mneifercons.examples"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.springframework.boot:spring-boot-starter-test:2.7.0")
    implementation("org.springframework.boot:spring-boot-starter-web:3.4.0")
    implementation("org.springdoc:springdoc-openapi-ui:1.6.8")
    implementation("org.glassfish.jaxb:jaxb-runtime:4.0.0")
}
testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            testType.set(TestSuiteType.UNIT_TEST)
            useJUnitJupiter()
            dependencies {
                implementation("org.springframework.boot:spring-boot-starter-test")
                implementation("io.rest-assured:spring-mock-mvc:4.5.0")
            }
        }
        val integrationTest by registering(JvmTestSuite::class) {
            testType.set(TestSuiteType.INTEGRATION_TEST)
            dependencies {
                implementation(project)
                implementation("io.rest-assured:rest-assured:4.5.1")
                implementation("io.rest-assured:json-path:4.5.1")
                implementation("io.rest-assured:xml-path:4.5.1")
            }
            sources {
                java {
                    setSrcDirs(listOf("src/it/java"))
                }
            }
            targets {
                all {
                    testTask.configure {
                        shouldRunAfter(test)
                    }
                }
            }
        }
    }
}
tasks.named("check") {
    dependsOn(testing.suites.named("integrationTest"))
}
