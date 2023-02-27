import play.sbt.PlayImport._
import sbt._

object AppDependencies {
  val bootStrapPlayVersion = "7.14.0"

  val compile = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-28" % bootStrapPlayVersion
  )

  val test = Seq(
    "com.vladsch.flexmark" % "flexmark-all" % "0.62.2" % Test,
    "org.scalatest" %% "scalatest" % "3.2.15" % Test)
}
