logLevel := Level.Warn


resolvers += Resolver.url("SBT Plugins", url("https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)
resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

addSbtPlugin("com.typesafe.sbt" % "sbt-web" % "1.2.2")
addSbtPlugin("com.typesafe.sbt" % "sbt-js-engine" % "1.0.1")