FROM java:openjdk-8-jdk

COPY ./target/Ratings.jar /usr/app

ENTRYPOINT ["java","-jar","/usr/app/Ratings.jar"]