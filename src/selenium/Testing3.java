package selenium;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.Assert;
import org.junit.Rule;

public class Testing3 {
	
	@Rule
	public ErrorCollector err = new ErrorCollector();
	
	
	@Test
	public void test6() {
		
		String expected = "abc";
		String actual = "abc";
		
		System.out.println("before 1st Assert");
		Assert.assertEquals(expected, actual);
		System.out.println("After 1st assert");
		Assert.assertTrue("Verify 2>3", 2>3);
		System.out.println("After 2nd assert");
	}
	
	@Test
	public void test7() {
		
		String expected = "abc";
		String actual = "abc1";
		
		System.out.println("before 1st Assert");
		try {
			Assert.assertEquals(expected, actual);
		}
		catch(Throwable t) {
			err.addError(t);
			System.out.println("I am in first catch");
		}
		System.out.println("After 1st assert");
		try {
			Assert.assertTrue("Verify 2>3", 2>3);
		}
		catch(Throwable t) {
			err.addError(t);
			System.out.println("I am in 2nd catch");
		}
		System.out.println("After 2nd assert");

	}
}
