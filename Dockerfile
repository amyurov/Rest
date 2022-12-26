FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

COPY target/Autorisation-0.0.1-SNAPSHOT.jar auth.jar

CMD ["java", "-jar", "auth.jar"]