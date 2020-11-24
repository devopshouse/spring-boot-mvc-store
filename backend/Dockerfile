## syntax=docker/dockerfile:experimental
FROM maven AS BUILD
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn clean package
## RUN --mount=type=cache,target=/root/.m2 mvn clean package

FROM openjdk:11-oracle
COPY --from=BUILD /tmp/target/*.jar app.jar
ENTRYPOINT ["java", "-jar","/app.jar", "--spring.profiles.active=docker"]
