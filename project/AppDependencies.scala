import play.sbt.PlayImport.*
import sbt.*

object AppDependencies {
  private lazy val bootstrapPlayVersion = "8.3.0"

  private val compile: Seq[ModuleID] = Seq(
    ws,
    "uk.gov.hmrc" %% "bootstrap-frontend-play-30" % bootstrapPlayVersion
  )

  private val test: Seq[ModuleID] = Seq(
    "org.scalatest" %% "scalatest"              % "3.2.17",
    "uk.gov.hmrc"   %% "bootstrap-test-play-30" % bootstrapPlayVersion
  ).map(_ % Test)

  def apply(): Seq[ModuleID]      = compile ++ test
}
