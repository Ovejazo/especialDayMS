FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} especialDayMS.jar
ENTRYPOINT ["java", "-jar", "/especialDayMS.jar"]