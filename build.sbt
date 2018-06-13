name := "planetos-macros"
organization := "com.planetos"

version := "1.3.2-SNAPSHOT"

scalaVersion := System.getProperty("planetos.scala.version","2.11.11")
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies ++= {
  Seq(
    "org.scala-lang"                  % "scala-reflect"     % scalaVersion.value
  )
}

scalacOptions ++= Seq("-unchecked", "-deprecation", "-language:experimental.macros")

publishTo := {
  val nexus: String = "http://repo.devops.planetos.com/archiva/repository/"
  if (isSnapshot.value)
    Some("Snapshots" at nexus + "snapshots")
  else
    Some("Releases" at nexus + "releases")
}
