name := "scalapp"

version := "1.0"

lazy val `scalapp` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( jdbc , cache , ws   ,
  "mysql" % "mysql-connector-java" % "5.1.38",
  "io.getquill" %% "quill-jdbc" % "0.9.0",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.8.2",
  "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.8.2",
  "org.scalatest" % "scalatest_2.11" % "3.0.0" % "test",
  specs2 % Test )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

