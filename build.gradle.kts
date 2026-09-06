plugins {
    java
    id("org.springframework.boot") version "4.1.1"
    id("io.spring.dependency-management") version "1.1.7"
}
java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}
group = "eu.mneifercons.examples"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:3.1.0")
    implementation("org.glassfish.jaxb:jaxb-runtime:4.0.0")
}
testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter()
            dependencies {
                implementation("org.springframework.boot:spring-boot-starter-test")
                implementation("io.rest-assured:spring-mock-mvc:6.0.1")
            }
        }
/*
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
 */
    }
}
