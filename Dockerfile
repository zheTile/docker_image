FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/docker-image-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]