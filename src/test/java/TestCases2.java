import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.cloudant.client.api.Database;

public class TestCases2 {
   
   private String MAVEN_HOME;
   private Database db = null;

   @Before
   public void setUp() throws Exception {
      MAVEN_HOME = System.getenv("MAVEN_HOME");
      try{
      	db = CloudantClientMgr.getDB();
      } catch (Exception e) {
      	return;
      }
   }

   @Test
   public void testMavenHome() {
      Assert.assertNotNull("Apache Maven is not setup!", MAVEN_HOME);
   }
   
   /*
   @Test
   public void testDatabaseConnection(){
   	  Assert.assertNotNull("Database connection failed!",db);
   }
   */
	
}
