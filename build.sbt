val Organization = "io.github.meltwin"
val ProjectName = "darkbucket"
val ProjectVersion = "1.0.0"

lazy val root = (project in file(".")).enablePlugins(SbtTwirl)

organization := Organization
name := ProjectName
version := ProjectVersion
scalaVersion := "2.13.3"
gitbucketVersion := "4.35.0"

scalacOptions := Seq("-deprecation", "-feature", "-language:postfixOps", "-Ydelambdafy:method", "-target:jvm-1.8")
javacOptions in compile ++= Seq("-target", "8", "-source", "8")

useJCenter := true

