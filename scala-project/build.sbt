
scalaVersion     := "2.12.2"
version          := "0.1.0-SNAPSHOT"
organization     := "com.example"
organizationName := "example"

addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.4")

val libs = Seq(
  "org.typelevel" %% "cats-core" % "1.6.0",
  "org.typelevel" %% "cats-effect" % "1.2.0",
  "org.atnos" %% "eff" % "5.1.0"
)

val commands = "import cats._, cats.data._, cats.implicits._"

lazy val root = (project in file("."))
  .settings(
    name := "cats-pra",
    libraryDependencies ++= libs,
    scalacOptions += "-Ypartial-unification",
    initialCommands in console := commands
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
