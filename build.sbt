name := "envishare-server"

version := "0.1"

scalaVersion := "2.13.1"

resolvers ++= Seq(
  "bintray-sbt-plugin-releases" at "http://dl.bintray.com/content/sbt/sbt-plugin-releases",
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Typesafe repository2" at "https://index.scala-lang.org/",
  "Typesafe repository3" at "https://mvnrepository.com/artifact/q"
)

val scalaTest = "org.scalatest" %% "scalatest" % "3.2.0-M1" % Test
val playJson  = "com.typesafe.play" %% "play-json" % "2.6.9"

lazy val hello = (project in file("."))
  .disablePlugins(PlayLayoutPlugin)
  .enablePlugins(PlayScala, GraphQLSchemaPlugin)
  .settings(
    name := "Hello",
    libraryDependencies ++= Seq(
      scalaTest,
      guice,
      filters,
      logback,
      "org.sangria-graphql" %% "sangria" % "2.0.0-M1",
      "org.sangria-graphql" %% "sangria-play-json" % "2.0.0",
      "org.elasticsearch.client" % "transport" % "6.2.3"
    )
  )