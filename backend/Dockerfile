FROM openjdk:8-jdk-alpine
COPY ./ ./
RUN gradle build
RUN mv ./build/libs*.jar ./app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]