name := """chat-me"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "3.3.1"


libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play"    % "7.0.1" % Test,
  "org.playframework" %% "play-slick"                 % "6.1.1",
  "org.playframework" %% "play-slick-evolutions"      % "6.1.1",
  "org.postgresql" % "postgresql"                     % "42.7.4",
  "org.apache.pekko" %% "pekko-actor"                 % "1.0.3",
  "org.apache.pekko" %% "pekko-actor-typed"           % "1.0.3",
  "org.apache.pekko" %% "pekko-stream"                % "1.0.3",
  "org.apache.pekko" %% "pekko-slf4j"                 % "1.0.3",
  "org.apache.pekko" %% "pekko-serialization-jackson" % "1.0.3",
  "org.mindrot" % "jbcrypt"                           % "0.4"
)
