FROM openjdk:11-jdk

WORKDIR /app

COPY gradlew .
COPY gradle gradle

COPY build.gradle .
COPY settings.gradle .

COPY src src

RUN ./gradlew build

# Set the entry point to run the application
ENTRYPOINT ["java", "-jar", "build/libs/gradle-demo-1.0-SNAPSHOT.jar"]
