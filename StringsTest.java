package amazon;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringsTest {
	Strings s=new Strings();
  @Test
  public void TesttoIntString() {
	  String a ="123";
	  Assert.assertEquals(s.intToString(123), a);
	  
  }
  @Test
  public void TesttoBinaryString() {
	  String a ="11111111";
	  Assert.assertEquals(s.intToBinaryString(255), a);
	  
  }
}
