import play.sbt.PlayImport._
import sbt._

object AppDependencies {
  val bootStrapPlayVersion = "7.0.0"
  val silencerVersion = "1.7.9"

  val compile = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-28" % bootStrapPlayVersion,
    compilerPlugin("com.github.ghik" % "silencer-plugin" % silencerVersion cross CrossVersion.full),
    "com.github.ghik" % "silencer-lib" % silencerVersion % Provided cross CrossVersion.full
  )

  val test = Seq(
    "com.vladsch.flexmark" % "flexmark-all" % "0.62.2" % Test,
    "org.scalatest" %% "scalatest" % "3.2.12" % Test)
}
