FROM openjdk:8-jdk-stretch

ENV INSTALL_DIR=/usr/local

ENV SCALA_HOME=$INSTALL_DIR/scala-2.13.0

ENV PATH=$SCALA_HOME/bin:$PATH

RUN apt-get update \
 && wget https://downloads.lightbend.com/scala/2.13.0/scala-2.13.0.tgz -P $INSTALL_DIR \
 && tar -xvzf $INSTALL_DIR/scala-2.13.0.tgz -C $INSTALL_DIR

ENTRYPOINT scala