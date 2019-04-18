FROM bigtruedata/sbt:0.13.15-2.12.2

ENV APPDIR=/scala-fun

WORKDIR $APPDIR

COPY ./scala-project/build.sbt .

CMD ["sbt", "console"]
