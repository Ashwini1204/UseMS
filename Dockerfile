FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/Infycart_UserMS-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8080
ENV JAVA_OPTS=""
RUN sh -c "touch Infycart_UserMS-0.0.1-SNAPSHOT.jar"
ENTRYPOINT [ "java", "-jar", "Infycart_UserMS-0.0.1-SNAPSHOT.jar" ]