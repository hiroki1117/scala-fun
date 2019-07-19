FROM openjdk:8 as build

ENV INSTALL_DIR=/usr/local

ENV SBT_HOME=$INSTALL_DIR/sbt/bin

ENV PATH=$SBT_HOME:$PATH

ENV APP_DIR=/app

COPY play-scala-chatroom-example $APP_DIR

WORKDIR $APP_DIR

RUN apt-get update \
    && wget https://piccolo.link/sbt-1.2.8.tgz -P $INSTALL_DIR \
    && tar -xvzf $INSTALL_DIR/sbt-1.2.8.tgz -C $INSTALL_DIR \
    && sbt dist \
    && unzip ./target/universal/play-chatroom-scala-example-2.7.x.zip -d ./target/universal

FROM openjdk:8-jre-alpine

ENV PATH=/execute/bin:$PATH

WORKDIR /execute

RUN apk add --no-chache bash

COPY --from=build /app/target/universal/play-chatroom-scala-example-2.7.x /execute

CMD ["play-chatroom-scala-example", "-Dplay.http.secret.key=ad31779d4ee49d5ad5162bf1429c32e2e9933f3b"]