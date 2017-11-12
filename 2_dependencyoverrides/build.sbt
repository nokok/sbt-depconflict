import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "net.nokok",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "dependencyOverrides",
  )

libraryDependencies += "com.typesafe.akka" %% "akka-http-core" % "10.0.10"
libraryDependencies += "com.typesafe.akka" % "akka-slf4j_2.12" % "2.5.6"

dependencyOverrides += "com.typesafe.akka" %% "akka-actor" % "2.4.19"
