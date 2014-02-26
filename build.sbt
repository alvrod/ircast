name := "ircast"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  cache,
  "org.apache.camel" % "camel-scala" % "2.12.2",
  "org.apache.camel" % "camel-spring" % "2.12.2",
  "org.apache.camel" % "camel-irc" % "2.12.2",
  "org.apache.camel" % "camel-mongodb" % "2.12.2",
  "org.springframework" % "spring-beans" % "3.+",
  "org.springframework" % "spring-context" % "3.+"
)     

play.Project.playScalaSettings
