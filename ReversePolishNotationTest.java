package jan3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ReversePolishNotationTest {

  @Test
  public void RPN() {
   //throw new RuntimeException("Test not implemented");
	String []a ={"12","13","+","5","*"};
	String []b ={"33","12","13","+","5","*","/"};
	ReversePolishNotation R= new ReversePolishNotation();
	System.out.println(R.RPN(b));
	Assert.assertEquals(R.RPN(a),125.00);
	Assert.assertEquals(R.RPN(b), 3.7878);
	//Assert.assertEquals(a.length, expected);
	//number of words files
	//
  }
}
