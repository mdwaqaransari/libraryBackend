FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} micro-ecom.jar
ENTRYPOINT ["java","-jar","/micro-ecom.jar"]