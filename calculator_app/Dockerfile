FROM maven:3.8.6-amazoncorretto-17 AS build
COPY src calculator_app/src
COPY pom.xml calculator_app
RUN mvn -f calculator_app/pom.xml clean package

FROM openjdk:17-oracle
COPY --from=build calculator_app/target/calculator_app.jar /usr/local/lib/calculator_app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/usr/local/lib/calculator_app.jar"]