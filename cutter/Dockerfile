FROM openjdk:8-jdk-alpine
MAINTAINER Arkadiy Kadymov
VOLUME /tmp
EXPOSE 8080
ADD ./target/cutter-0.0.1-SNAPSHOT.jar urlcutter.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/urlcutter.jar"]