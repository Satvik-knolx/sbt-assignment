ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "1.3.6"

lazy val root = (project in file("."))
  .settings(
    name := "projectTwo",
    idePackagePrefix := Some("com.knoldus")
  )

libraryDependencies +="io.snappydata" % "snappydata-jdbc_2.11" % "1.3.1"
libraryDependencies += "joda-time" % "joda-time" % "2.12.2"
updateOptions := updateOptions.value.withCachedResolution(true)