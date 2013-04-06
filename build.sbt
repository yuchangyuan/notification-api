name := "notification-api"

version := "1.0"

organization := "me.ycy"

scalaVersion := "2.10.1"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies ++= Seq(
  "net.databinder" %% "dispatch-json" % "0.8.9"
)
