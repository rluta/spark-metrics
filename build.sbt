lazy val root = (project in file("."))
  .settings(
    name := "spark-metrics",
    organization := "com.banzaicloud",
    scalaVersion := "2.12.8",
    version      := "2.4-2.0.4",
    libraryDependencies ++= Seq(
      "io.prometheus" % "simpleclient" % "0.3.0",
      "io.prometheus" % "simpleclient_dropwizard" % "0.3.0",
      "io.prometheus" % "simpleclient_pushgateway" % "0.3.0",
      "io.dropwizard.metrics" % "metrics-core" % "3.1.2",
      "org.slf4j" % "slf4j-api" % "1.7.16",
      "com.google.guava" % "guava" % "26.0-android",
      "io.prometheus.jmx" % "collector" % "0.10",
      "com.novocode" % "junit-interface" % "0.11" % Test
    )
  )

publishMavenStyle := true

publishTo := {
  if (isSnapshot.value)
    Some(Resolver.file("file",  new File( "maven-repo/snapshots" )) )
  else
    Some(Resolver.file("file",  new File( "maven-repo/releases" )) )
}
