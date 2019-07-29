FROM gradle:4.7.0-jdk8-alpine AS build
COPY ./ ./
RUN ./gradlew build
RUN mv ./build/libs*.jar ./app.jar
FROM openjdk:8-jdk-alpine
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]