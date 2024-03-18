FROM openjdk:17-oracle

EXPOSE 8080

COPY /target/spring-boot-learn-*.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "my-app-1.0-SNAPSHOT.jar"]
