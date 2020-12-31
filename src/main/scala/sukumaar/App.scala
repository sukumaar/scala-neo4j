package sukumaar

import org.neo4j.graphdb.factory.GraphDatabaseFactory
import sukumaar.Constants.{DEFAULT_DATABASE_NAME, NEO4J_CONF_FILE_NAME, NEO4J_DATA_PATH}

import java.io.File
import java.util.Properties

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val prop = new Properties()
    prop.load(getClass.getResourceAsStream(s"/$NEO4J_CONF_FILE_NAME"))

    val homeDir = s"${System.getProperty("user.dir")}/${prop.getProperty(NEO4J_DATA_PATH)}"


    val graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(new File(homeDir))


    sys.addShutdownHook(graphDb.shutdown())

    1 == 1
  }
}