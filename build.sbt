lazy val commonSettings = Seq(
  organization := "org.flatspace",
  version := "0.0.1",
  scalaVersion := "2.11.8"
)

lazy val testDependencies = "org.scalatest" %% "scalatest" % "2.2.6" % "test"

lazy val lemons = (project in file("")).
  settings(commonSettings: _*).
  settings(
    name := "lemons",
    libraryDependencies += testDependencies
  )