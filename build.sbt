name := "scala-neo4j"

version := "0.1"

scalaVersion := "2.11.12"

//Neo4j
libraryDependencies += "org.neo4j" % "neo4j" % "3.5.25"

// https://mvnrepository.com/artifact/org.neo4j/neo4j-cypher
libraryDependencies += "org.neo4j" % "neo4j-cypher" % "3.5.25"

// https://mvnrepository.com/artifact/org.apache.tinkerpop/gremlin-core
//libraryDependencies += "org.apache.tinkerpop" % "gremlin-core" % "3.4.1"

// https://mvnrepository.com/artifact/org.apache.tinkerpop/neo4j-gremlin
//libraryDependencies += "org.apache.tinkerpop" % "neo4j-gremlin" % "3.4.1" % Test


//For Testing
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % Test
