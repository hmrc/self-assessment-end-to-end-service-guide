import play.sbt.PlayImport.*
import sbt.*

object AppDependencies {
  private val bootStrapPlayVersion = "7.22.0"

  private val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-28" % bootStrapPlayVersion
  )

  private val test: Seq[ModuleID] = Seq(
    "com.vladsch.flexmark" % "flexmark-all"           % "0.64.8",
    "org.scalatest"       %% "scalatest"              % "3.2.17",
    "uk.gov.hmrc"         %% "bootstrap-test-play-28" % bootStrapPlayVersion
  ).map(_ % Test)

  def apply(): Seq[ModuleID]      = compile ++ test
}
