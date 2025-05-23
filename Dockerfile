FROM openjdk:17
ARG JAR_FILE=./target7*.jar
COPY ${JAR_FILE} especialDayMS.jar
ENTRYPOINT ["java", "-jar", "/especialDayMS.jar"]