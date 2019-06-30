FROM openjdk:8-jdk
WORKDIR /app
COPY target/*.jar /app/
EXPOSE 7000
CMD ["java", "-jar","vechilemanagement-0.0.1-SNAPSHOT.jar" ]