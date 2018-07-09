import sbt._

object AppDependencies {

  val playVersion = "2.6.15"

  val compile = Seq(
    "uk.gov.hmrc"       %% "simple-reactivemongo"            % "6.1.0",
    "com.typesafe.play" %% "play-iteratees"                  % "2.6.1",
    "com.typesafe.play" %% "play-iteratees-reactive-streams" % "2.6.1",
    "com.typesafe.play" %% "play"                            % playVersion,
    "com.typesafe.play" %% "play-guice"                      % playVersion
  )

  val test = Seq(
    "com.typesafe.play"      %% "play-test"          % playVersion % Test,
    "org.scalatest"          %% "scalatest"          % "3.0.5"     % Test,
    "org.pegdown"            %  "pegdown"            % "1.5.0"     % Test,
    "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2"     % Test
  )

}
