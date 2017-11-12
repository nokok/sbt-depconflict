import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "net.nokok",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "removeslf4j",
  )

libraryDependencies += "com.typesafe.akka" %% "akka-http-core" % "10.0.10"
