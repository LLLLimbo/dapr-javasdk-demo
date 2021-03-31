FROM openjdk:8-jre-alpine
MAINTAINER LLLimbo
ENV LANG C.UTF-8
ENV TZ Asia/Shanghai
ADD target/hello-service*.jar /app.jar
ENTRYPOINT java -jar /app.jar