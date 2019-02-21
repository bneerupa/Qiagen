/**
 * 
 */
package qatestjava;

/**
 * @author neerupa
 *
 */
public class DistanceBetweenNumbers {

	/**
	 * @param args
	 * Method to find the distance between two numbers in Array
	 */
	public static int distanceOfNumbers(int[] input) {
		int len=input.length;
		Integer min=null;
		int returnindex=0;
		for(int i =0;i<len-1;i++) {
			int value= Math.abs(input[i]-input[i+1]);
			//System.out.println("value :" +value);
			
			if(min == null) {min=value; returnindex=i;}
			
			else if (min > value) {
				min=value;
				returnindex=i;
			}
			//System.out.println("min :" +min);
		}
		return returnindex;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {4,8,6,1,2,9,4};
		System.out.println(DistanceBetweenNumbers.distanceOfNumbers(input));

	}

}
