FROM openjdk:8
ADD build/libs/SpringBoot-demo.jar SpringBoot-demo.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "SpringBoot-demo.jar"]