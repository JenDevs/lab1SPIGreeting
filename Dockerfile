# Base image with JDK
FROM eclipse-temurin:24-jdk

# Set working directory in the container
WORKDIR /app

# Copy compiled files
COPY serviceconsumer/target/serviceconsumer-1.0-SNAPSHOT.jar /app/greeting.jar

# Run the application
ENTRYPOINT ["java", "-jar", "greeting.jar"]
