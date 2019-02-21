package javatest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import qatestjava.DistanceBetweenNumbers;

public class DistanceBetweenNumbersTest extends DistanceBetweenNumbers {
	
	
	
	@Test
	public void checkDistance() {
		int[] input = {4,8,6,1,2,9,4};
		int[] input1 = {1,3,3,4,5};
		int index=distanceOfNumbers(input);
		assertEquals(index, 3);
		 index=distanceOfNumbers(input1);
		 assertEquals(index, 1);
	}
	
	

}
