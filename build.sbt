name := "ircast"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.apache.camel" % "camel-scala" % "2.12.2",
  "org.apache.camel" % "camel-spring" % "2.12.2",
  "org.apache.camel" % "camel-irc" % "2.12.2",
  "com.typesafe.akka" % "akka-camel_2.10" % "2.2.+",
  "org.springframework" % "spring-beans" % "3.2.+",
  "org.springframework" % "spring-context" % "3.2.+"
)     

play.Project.playScalaSettings
