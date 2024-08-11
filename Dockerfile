# Use an official Java runtime as a parent image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the project jar file into the container at /app
COPY target/spring-boot-docker-postgresql-0.0.1-SNAPSHOT.jar /app/spring-boot-docker-postgresql-app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "spring-boot-docker-postgresql-app.jar"]