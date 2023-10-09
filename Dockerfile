FROM openjdk:18
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/api_examen_parcial_202117419-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} api_examen_parcial_202117419.jar
ENTRYPOINT ["java", "-jar","api_examen_parcial_202117419.jar"]