package abc;

import org.testng.annotations.Test;

import abc.ReverseWords;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class ReveerseWordsTest {
  
	String testdata= "Hello world";
	ReverseWords words = new ReverseWords();
			
	@Test
  public void f() {
		Assert.assertEquals(words.reverseWords(testdata),"world Hello");
		Assert.assertEquals(words.reverseWords("I am happy"),"happy am I");

		
  }
	@Test
	public void falseTest(){
		
		Assert.assertNotEquals(words.reverseWords("I am happy"), "am I");

	}
  

}
