name := "planetos-macros"
organization := "com.planetos"

version := "1.3.2-SNAPSHOT"

scalaVersion := System.getProperty("planetos.scala.version","2.11.11")
javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Sonatype snapshots"  at "http://oss.sonatype.org/content/repositories/snapshots/",
  "Spray Repository"    at "http://repo.spray.io",
  "Open Source Geospatial Foundation Repository" at "http://download.osgeo.org/webdav/geotools/"
)
resolvers += Resolver.jcenterRepo

libraryDependencies ++= {

  Seq(
    "org.scala-lang"                  % "scala-reflect"     % scalaVersion.value
  )
}

scalacOptions ++= Seq("-unchecked", "-deprecation", "-language:experimental.macros")

publishTo := { if (isSnapshot.value)
  Some("Planet OS Snapshots" at "http://repo.devops.planetos.com/archiva/repository/snapshots")
else
  Some("Planet OS Repository" at "http://repo.devops.planetos.com/archiva/repository/releases")
}
publishArtifact in (Test, packageBin) := true

