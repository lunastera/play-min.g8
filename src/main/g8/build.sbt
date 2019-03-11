val commonSettings = Def.settings(
  scalaVersion := "$scala_version$"
)

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    commonSettings,
    name := "$name$",
    version := "0.0.1",
    organization := "com.github.sobreera",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.0" % Test
    )
  )