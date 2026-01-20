FROM eclipse-temurin:21-jre-alpine

WORKDIR /usr/app

COPY target/test-jenkins-1.0-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
