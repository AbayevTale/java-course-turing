FROM openjdk:21
WORKDIR /app
COPY target/*.jar app.jar
RUN echo Hello world
ENTRYPOINT ["java", "-jar", "app.jar"]