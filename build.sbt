lazy val root = (project in file(".")).settings(
  organization := "org.scalatra.scalate",
  name := "scalamd",
  version := "1.7.0-RC1",
  scalaVersion := "2.11.8",
  crossScalaVersions := Seq("2.12.0-RC2", "2.11.8", "2.10.6"),
  transitiveClassifiers in Global := Seq(Artifact.SourceClassifier),
  scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
  incOptions := incOptions.value.withNameHashing(true),
  libraryDependencies ++= Seq(
    "commons-io"   %  "commons-io"   % "1.4"     % Test,
    "commons-lang" %  "commons-lang" % "2.5"     % Test,
    "junit"        %  "junit"        % "4.12"    % Test,
    "org.specs2"   %% "specs2-core"  % "3.8.5.1" % Test
  ),
  publishMavenStyle := true,
  pomIncludeRepository := { x => false },
  pomExtra := <url>https://github.com/scalatra/scalamd/</url>
  <licenses>
    <license>
      <name>Apache License, Version 2.0</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.html</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:scalatra/scalamd.git</url>
    <connection>scm:git:git@github.com:scalatra/scalamd.git</connection>
  </scm>
  <developers>
    <developer>
      <id>rossabaker</id>
      <name>Ross A. Baker</name>
      <url>http://www.rossabaker.com/</url>
    </developer>
    <developer>
      <id>seratch</id>
      <name>Kazuhiro Sera</name>
      <url>https://github.com/seratch</url>
    </developer>
  </developers>
).settings(scalariformSettings)
