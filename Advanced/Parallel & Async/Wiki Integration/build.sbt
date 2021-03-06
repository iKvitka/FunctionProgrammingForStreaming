scalaSource in Compile := baseDirectory.value / "src"
scalaSource in Test := baseDirectory.value / "test"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3"
libraryDependencies += "com.typesafe.akka" %% "akka-actor-typed" % "2.6.10"
libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.6.10"
libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.2.1"
libraryDependencies += "com.typesafe.akka" %% "akka-http-xml" % "10.2.1"
