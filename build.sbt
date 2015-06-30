name := "c2-app"

version := "0.1"

scalaVersion := "2.11.6"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= { Seq(
	"io.spray"		%% "spray-can"			% "1.3.3",
	"io.spray"		%% "spray-routing"		% "1.3.3",
	"com.typesafe.akka"	%% "akka-actor"			% "2.3.9"
)}