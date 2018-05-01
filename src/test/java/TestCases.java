import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCases {
   
   private String MAVEN_HOME;

   @Before
   public void setUp() throws Exception {
      MAVEN_HOME = System.getenv("MAVEN_HOME");
   }

   @Test
   public void testMavenHome() {
      Assert.assertNotNull("Apache Maven is not setup!", MAVEN_HOME);
   }
	
}
