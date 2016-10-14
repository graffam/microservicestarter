name := "MicroServiceStarter"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.10",
  "com.typesafe.akka" %% "akka-cluster" % "2.4.10",
  "com.typesafe.akka" %% "akka-http-experimental" % "2.4.10",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.10",
  "com.typesafe.akka" %% "akka-slf4j" % "2.4.11",
  "org.scalactic" %% "scalactic" % "3.0.0",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)

// Configures Sbt Assembly
lazy val root = (project in file(".")).
  settings(
    name := "micro-service-starter",
    version := "1.0",
    scalaVersion := "2.11.8",
    mainClass in Compile := Some("com.graff.microservicestarter.Application")
  )
