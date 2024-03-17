# syntax=docker/dockerfile:1
FROM maven:3.8.1-jdk-11 AS build
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
##RUN mvn clean package
RUN --mount=type=cache,target=/root/.m2 mvn clean package

FROM openjdk:11-oracle
COPY --from=build /tmp/target/*.jar app.jar

# ENV
ENV DB_HOST localhost
ENV SPRING_PROFILE default

ENTRYPOINT ["java", "-DDATABASE_HOST=${DB_HOST}", "-jar","/app.jar", "--spring.profiles.active=${SPRING_PROFILE}"]
