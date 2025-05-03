FROM eclipse-temurin:24-jdk
WORKDIR /app

COPY runtime/ ./runtime/

ENTRYPOINT ["java", "-p", "runtime", "-m", "org.example.greeting.serviceconsumer/org.example.greeting.serviceconsumer.Main"]
