ThisBuild / organization := "$organization;format="package"$"
ThisBuild / homepage := Some(url("https://github.com/$git_username$/$name;format="lower,hyphen"$"))
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/$git_username$/$name;format="lower,hyphen"$"),
    "scm:git@github.com:$git_username$/$name;format="lower,hyphen"$.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id = "$git_username$",
    name = "",
    email = "",
    url = url("https://github.com/$git_username$")
  )
)
ThisBuild / publishMavenStyle := true
ThisBuild / pgpPassphrase := sys.env.get("PGP_PASSPHRASE").map(_.toArray)
ThisBuild / credentials += (for {
  username <- sys.env.get("SONATYPE_USERNAME")
  password <- sys.env.get("SONATYPE_PASSWORD")
} yield Credentials(
  "Sonatype Nexus Repository Manager",
  "oss.sonatype.org",
  username,
  password
))
ThisBuild / dynverSonatypeSnapshots := true
ThisBuild / publishTo := sonatypePublishToBundle.value

publish / skip := true

lazy val apps = project.settings(
  name := "$name;format="lower,hyphen"$",
  Compile / resourceDirectory := baseDirectory.value / "resources",
  crossPaths := false,
  autoScalaLibrary := false
)
