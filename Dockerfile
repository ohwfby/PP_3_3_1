FROM openjdk:17

COPY /target/springcourse-0.0.1-SNAPSHOT.jar backend.jar

ENTRYPOINT ["java", "-jar", "backend.jar"]
EXPOSE 8080