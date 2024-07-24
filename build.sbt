ThisBuild / majorVersion := 0
ThisBuild / scalaVersion := "2.13.14"

lazy val microservice = Project("self-assessment-end-to-end-service-guide", file("."))
  .enablePlugins(PlayScala, SbtDistributablesPlugin)
  .settings(
    libraryDependencies ++= AppDependencies(),
    scalacOptions += "-Wconf:src=routes/.*:s"
  )

addCommandAlias("scalafmtAll", "all scalafmtSbt scalafmt Test/scalafmt")
