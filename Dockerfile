FROM amazoncorretto:17-alpine-jdk

COPY /globalDeployTest-0.0.1-SNAPSHOT.jar globalDeployTest-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/globalDeployTest-0.0.1-SNAPSHOT.jar"]