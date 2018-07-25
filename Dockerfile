FROM openjdk:8
ADD build/libs/demo.jar demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "SpringBoot-demo.jar"]