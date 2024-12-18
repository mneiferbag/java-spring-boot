# Java Spring Example

Licensed under the MIT License. See file [LICENSE](./LICENSE).

Java [Spring](https://spring.io/) example. Example includes code written in Java.

[![CodeQL](https://github.com/mneiferbag/java-spring-boot/actions/workflows/codeql-analysis.yml/badge.svg?branch=main)](https://github.com/mneiferbag/java-spring-boot/actions/workflows/codeql-analysis.yml)
[![Java CI with Gradle](https://github.com/mneiferbag/java-spring-boot/actions/workflows/gradle.yml/badge.svg)](https://github.com/mneiferbag/java-spring-boot/actions/workflows/gradle.yml)

## Spring Boot

The Swagger UI page is available at

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

and the OpenAPI description is available at

[http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)

## Gradle

Check version with command `gradle -v`.

Run `gradlew wrapper --gradle-version latest` to update the project to latest version.

Run `gradlew wrapper --gradle-version 7.4.2` to update the project to 7.4.2.

## Links

* OpenAPI
  * [OpenAPI 3 Library for Spring Boot](https://springdoc.org/)
  * [OpenAPI Initiative (OAI)](https://www.openapis.org/)
  * [OpenAPI Spec 3.0.1](https://spec.openapis.org/oas/v3.0.1)
  * [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)
  * [Swagger Editor](http://editor.swagger.io/)
  * [Swagger Validator](https://validator.swagger.io/)
* Testing
  * [Cornutum/tcases](https://github.com/Cornutum/tcases) - A model-based test case generator
  * [REST Assured](http://rest-assured.io/) - Testing and validating REST services in Java
  * [Testing the Web Layer](https://spring.io/guides/gs/testing-web/) - Spring Guide
* General
  * [GitHub Action Setup Java](https://github.com/actions/setup-java) for use with GitHub CodeQL
  * [Gradle Build Tool](https://gradle.org/)
  * [Gretty](https://gretty-gradle-plugin.github.io/gretty-doc/about.html) - a feature-rich gradle plugin for running web-apps on embedded servlet containers
  * [Java Development Examples](https://github.com/mneiferbag/java-examples)

## Tasks

- [ ] Upgrade to latest versions of Java, Spring Boot, Gradle, see [Upgrade Guide](./doc/upgrade_guide.adoc)
- [ ] Add Jetty execution in check task before integration tests are run
- [ ] Compare generated openapi.yaml and api_v3.yaml
- [ ] Add Gradle integration tests
  - https://docs.gradle.org/current/userguide/migrating_from_maven.html#migmvn:build_lifecycle
  - https://docs.gradle.org/current/userguide/migrating_from_maven.html#migmvn:integration_tests
  - https://docs.gradle.org/current/userguide/java_testing.html#sec:configuring_java_integration_tests 
