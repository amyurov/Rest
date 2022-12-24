FROM openjdk:8-jdk-alpine

EXPOSE 8080

COPY target/Autorisation-0.0.1-SNAPSHOT.jar auth.jar