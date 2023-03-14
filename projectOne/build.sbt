ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "1.3.6"

lazy val root = (project in file("."))
  .settings(
    name := "projectOne"
  )
  .aggregate(core,utils)

lazy val core = (project in file("core"))
  .settings(
    name := "core",

    libraryDependencies +="org.scalatest" %% "scalatest" % "3.2.15" % "test"

  ).dependsOn(utils)

lazy val utils = (project in file("utils"))
  .settings(
    name := "utils",

  )
libraryDependencies +="projecttwo" %% "projecttwo" % "0.1.0-SNAPSHOT"
