# syntax=docker/dockerfile:experimental
FROM maven:3.8.1-jdk-11 AS BUILD
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
##RUN mvn clean package
RUN --mount=type=cache,target=/root/.m2 mvn clean package

FROM openjdk:11-oracle
COPY --from=BUILD /tmp/target/*.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar", "--spring.profiles.active=local"]
