package sukumaar

import org.neo4j.graphdb.factory.{GraphDatabaseFactory, GraphDatabaseSettings}
import org.scalatest.funsuite.AnyFunSuite
import sukumaar.Constants.{NEO4J_CONF_FILE_NAME, NEO4J_DATA_PATH}

import java.io.File
import java.util.Properties

class Test extends AnyFunSuite {

  test("this is first test") {
    val prop = new Properties()
    prop.load(getClass.getResourceAsStream(s"/$NEO4J_CONF_FILE_NAME"))
    val homeDir = s"${System.getProperty("user.dir")}/${prop.getProperty(NEO4J_DATA_PATH)}"
    /*val graphDb = new GraphDatabaseFactory()
      .newEmbeddedDatabase(new File(homeDir))
*/

    val bolt = new org.neo4j.kernel.configuration.BoltConnector("0");

    val graphDbEmbedded = new GraphDatabaseFactory()
      .newEmbeddedDatabaseBuilder(new File(homeDir))
      .loadPropertiesFromFile(getClass.getResource(s"/$NEO4J_CONF_FILE_NAME").getFile)
      .newGraphDatabase();

    graphDbEmbedded.execute()
    sys.addShutdownHook(graphDbEmbedded)

    1==1
  }
}
