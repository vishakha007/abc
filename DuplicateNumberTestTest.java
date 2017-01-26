package abc;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DuplicateNumberTestTest {
int v1,v2;
DuplicateNumber Dp =new DuplicateNumber();
  @Test
  public void setUp() {
    //throw new RuntimeException("Test not implemented");
  
  v1=1;
  v2=7;
  }

  @Test
  public void test() {
    //throw new RuntimeException("Test not implemented");
	  int add=v1+v2;
		assertTrue(add==8);
  
  }
  @Test
  public void DuplicateNumTest (){
	  List<Integer> numbers = new ArrayList<Integer>();
      for(int i=1;i<30;i++){
          numbers.add(i);
      }
      //add duplicate number into the list
      numbers.add(22);
      Assert.assertEquals(Dp.findDuplicateNumber(numbers),22);
  }
}
