FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/api_examen_parcial_202117419-0.0.1-SNAPSHOT.jar api_examen_parcial_202117419.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","api_examen_parcial_202117419.jar"]