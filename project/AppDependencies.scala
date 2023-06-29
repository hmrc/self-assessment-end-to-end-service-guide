import play.sbt.PlayImport.*
import sbt.*

object AppDependencies {
  private val bootStrapPlayVersion = "7.19.0"

  val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-28" % bootStrapPlayVersion
  )

  val test: Seq[ModuleID] = Seq(
    "com.vladsch.flexmark" % "flexmark-all"           % "0.64.8"             % Test,
    "org.scalatest"       %% "scalatest"              % "3.2.16"             % Test,
    "uk.gov.hmrc"         %% "bootstrap-test-play-28" % bootStrapPlayVersion % Test
  )
}
