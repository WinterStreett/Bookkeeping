FROM eclipse-temurin:8-jdk-alpine

ADD target/*.jar app.jar

CMD ["java", "-jar", "/app.jar"]

EXPOSE 8080