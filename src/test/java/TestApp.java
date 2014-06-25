import junit.framework.*;
import main.App;

public class TestApp extends TestCase {

/*
  protected void setUp() {
    // put common setup code in here
  }
   
  protected void tearDown() {
    // put common cleanup code in here
  }
*/

  public void testInsertAndGetData() {
    String result = "";
    try {
      App app = new App();
      result = app.getData();
    } finally {
      assertEquals("Hope this works!", result);
    }
  } 
}

