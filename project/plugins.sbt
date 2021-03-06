scalacOptions ++= Seq("-unchecked", "-deprecation")
ivyLoggingLevel := UpdateLogging.Quiet
addSbtPlugin("com.fommil" % "sbt-sensible" % "1.1.6")

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
