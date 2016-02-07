name := "hystrix-play"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.netflix.archaius" % "archaius-scala" % "0.7.3",
  "com.netflix.hystrix" % "hystrix-core" % "1.4.23",
  "com.netflix.hystrix" % "hystrix-metrics-event-stream" % "1.4.23",
  "com.netflix.rxjava"  % "rxjava-scala" % "0.20.7"
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)