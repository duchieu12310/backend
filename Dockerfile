# Stage 1: Build the application
FROM gradle:8.7-jdk17 AS build
COPY --chown=gradle:gradle . /dh/jobhunter
WORKDIR /dh/jobhunter

#skip task: test
RUN gradle clean build -x test --no-daemon

# Stage 2: Run the application
FROM openjdk:17-slim
EXPOSE 8080
COPY --from=build /dh/jobhunter/build/libs/*.jar /dh/spring-boot-job-hunter.jar
ENTRYPOINT ["java", "-jar", "/dh/spring-boot-job-hunter.jar"]
