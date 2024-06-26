from openjdk:8
EXPOSE 8080
ADD target/myrevaturedocker.jar myrevaturedocker.jar
ENTRYPOINT ["java","jar","/myrevaturedocker.jar"]