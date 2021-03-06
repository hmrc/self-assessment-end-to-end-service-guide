import uk.gov.hmrc.sbtdistributables.SbtDistributablesPlugin.publishingSettings

val appName = "self-assessment-end-to-end-service-guide"

scalaVersion := "2.12.12"

lazy val microservice = Project(appName, file("."))
  .enablePlugins(play.sbt.PlayScala, SbtDistributablesPlugin)
  .settings(
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
    evictionWarningOptions in update := EvictionWarningOptions.default.withWarnScalaVersionEviction(false),
    majorVersion := 0
  )
  .settings(
    publishingSettings: _*
  )
  .settings(resolvers += Resolver.jcenterRepo)

scalacOptions ++= Seq(
  "-P:silencer:pathFilters=views;routes"
)
