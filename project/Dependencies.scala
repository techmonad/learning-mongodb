import sbt._

object Dependencies {

  val rxScalaVersion          = "0.26.4"
  val rxStreamsVersion        = "1.0.0"

  val rxScala           = "io.reactivex" %% "rxscala" % rxScalaVersion
  val rxStreams         = "org.reactivestreams" % "reactive-streams" % rxStreamsVersion

}
