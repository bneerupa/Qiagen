package javatest;

import org.testng.Assert;
import org.testng.annotations.Test;

import qatestjava.AnagramString;

public class AnagramStringTest extends AnagramString {
	
	@Test
	public void AngramTest() {
		
		Assert.assertTrue(checkAnagram("Race" , "Care"));
		Assert.assertFalse(checkAnagram("new" , "wes"));
		Assert.assertFalse(checkAnagram("The eyes " , "Thy eyes "));
		Assert.assertTrue(checkAnagram("School master" , "The classroom"));
		
		
	}
	
	
	

}
