val appName = "self-assessment-end-to-end-service-guide"

lazy val microservice = Project(appName, file("."))
  .enablePlugins(PlayScala, SbtDistributablesPlugin)
  .settings(
    libraryDependencies ++= AppDependencies(),
    scalacOptions += "-Wconf:src=routes/.*:s",
    majorVersion := 0,
    scalaVersion := "2.13.12"
  )

addCommandAlias("scalafmtAll", "all scalafmtSbt scalafmt Test/scalafmt")
addCommandAlias("scalastyleAll", "all scalastyle Test/scalastyle")
