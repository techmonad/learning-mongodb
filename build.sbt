name := "learning-mongodb"

version := "0.1"

scalaVersion := "2.12.6"

lazy val rxScalaVersion = "0.26.4"
lazy val rxStreamsVersion = "1.0.0"

libraryDependencies ++= Seq(
  "io.reactivex" %% "rxscala" % rxScalaVersion,
  "org.reactivestreams" % "reactive-streams" % rxStreamsVersion,
  "org.mongodb.scala" %% "mongo-scala-driver" % "2.4.1"
)