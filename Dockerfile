FROM java:openjdk-8-jdk

COPY ./target/Ratings-0.0.1-SNAPSHOT.jar /usr/app

ENTRYPOINT ["java","-jar","/usr/app/Ratings-0.0.1-SNAPSHOT.jar"]