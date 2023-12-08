FROM openjdk:11-jre-slim
EXPOSE 9999
ADD ./target/java-open-api-specification-1.0.0-SNAPSHOT.jar java-open-api-specification-1.0.0-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "java-open-api-specification-1.0.0-SNAPSHOT.jar"]