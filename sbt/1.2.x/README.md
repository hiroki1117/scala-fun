# SBT  -- Scala build tool

### tags
**1.2.x**  
**1.1.x**  
**0.13.x**  

### How to use

first, you create a project ( gitter8 template from scala/scala-seed.g8)

```
docker run -it --rm -v $(pwd):/app hiroki1117/sbt
```

second, move to your project directory and
```
docker run -it --rm -v $(pwd):/app hiroki1117/sbt sbt
```

Congrats! you can start Scala project.



if you start [playframework](https://www.playframework.com/)
```
docker run -it --rm hiroki1117/sbt sbt new playframework/play-scala-seed.g8
```

created Play project.