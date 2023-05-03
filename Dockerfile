FROM amazoncorretto:8-alpine-jdk

COPY target/Argentina-Programa-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]