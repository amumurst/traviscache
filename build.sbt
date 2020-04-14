import scala.concurrent.duration._

organization := "no.amumurst"
name := "traviscache"
scalaVersion := "2.13.1"
version := "0.1.0-SNAPSHOT"

libraryDependencies += "org.typelevel" %% "cats-effect" % "2.1.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % "test"
libraryDependencies += "org.scalameta" %% "munit" % "0.7.1" % Test
testFrameworks += new TestFramework("munit.Framework")

cachedCiTestFullPeriod := 7.days
