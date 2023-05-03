scalaVersion := "2.13.8"

name         := "frameless-example"
organization := "com.kevchuang"
version      := "1.0"

libraryDependencies += "org.apache.spark" %% "spark-sql"         % "3.4.0"
libraryDependencies += "org.typelevel"    %% "frameless-dataset" % "0.14.0"
