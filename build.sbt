name := "λ4j"
organization := "org.λ4j"
version := "1.0-SNAPSHOT"
description := "λ4j Is An Enhanced Functional Library for Java"
publishMavenStyle := true
crossPaths := false
autoScalaLibrary := false
scalaVersion := "2.11.8"
resolvers ++= Seq(
  Resolver.mavenLocal
)
libraryDependencies ++= {
  object Version {
    val junit = "4.12"
  }
  Seq(
    "junit" % "junit" % Version.junit % "test"
  )
}