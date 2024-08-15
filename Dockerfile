FROM openjdk:22-jdk
ADD target/job-application.jar job-application.jar
ENTRYPOINT ["java", "-jar", "/job-application.jar"]