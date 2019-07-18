FROM openjdk:8-jdk-stretch

ENV INSTALL_DIR=/usr/local

ENV SBT_HOME=$INSTALL_DIR/sbt/bin

ENV PATH=$SBT_HOME:$PATH

ENV APP_DIR=/app

WORKDIR $APP_DIR

RUN apt-get update \
    && wget https://piccolo.link/sbt-1.2.8.tgz -P $INSTALL_DIR \
    && tar -xvzf $INSTALL_DIR/sbt-1.2.8.tgz -C $INSTALL_DIR \
    && sbt new scala/scala-seed.g8 --name=sample \
    && rm -rf sample

CMD ["sbt","new","scala/scala-seed.g8"]