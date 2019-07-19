FROM hiroki1117/sbt:1.2.x as build

ENV APP_DIR=/http4sapp

COPY http4s-api $APP_DIR

WORKDIR $APP_DIR

RUN sbt assembly


FROM openjdk:8-jre-alpine

WORKDIR /execute

COPY --from=build /http4sapp/target/scala-2.12/http4s-api-assembly-0.0.1-SNAPSHOT.jar /execute

CMD ["java","-jar","http4s-api-assembly-0.0.1-SNAPSHOT.jar"]