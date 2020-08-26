/* ScalablyTyped configuration */
enablePlugins(ScalablyTypedConverterGenSourcePlugin)

scalaVersion := "2.13.2"
name := "react-router-native-slinky"
version := "0.1.1"

/* javascript / typescript deps */
Compile / npmDependencies ++= Seq(
  "@types/react" -> "16.9.42",
  "@types/react-native" -> "^0.62.4",
  "@types/react-router-native" -> "^5.1.0",
  "react-router-native" -> "5.1.2"
)

/* disabled because it somehow triggers many warnings */
scalaJSLinkerConfig ~= (_.withSourceMap(false))

// because npm is slow
useYarn := true

// say we want custom code for slinky
stFlavour := Flavour.SlinkyNative

// focus only on these libraries
stMinimize := Selection.AllExcept("react-router-native")

// shade into another package
stOutputPackage := "vision.id.rrn.facade"

publishMavenStyle := true
homepage := Some(new URL("https://github.com/mcallisto/react-router-native-slinky"))
startYear := Some(2020)
pomExtra := (
  <scm>
    <connection>scm:git:github.com:/mcallisto/react-router-native-slinky</connection>
    <developerConnection>scm:git:git@github.com:mcallisto/react-router-native-slinky.git</developerConnection>
    <url>github.com:mcallisto/react-router-native-slinky.git</url>
  </scm>
    <developers>
      <developer>
        <id>mcallisto</id>
        <name>Mario Càllisto</name>
      </developer>
    </developers>
  )
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "libs"
