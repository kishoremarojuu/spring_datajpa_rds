FROM openjdk:8
#ADD target/spring_datajpa_rds.jar spring_datajpa_rds.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "spring_datajpa_rds.jar"]
