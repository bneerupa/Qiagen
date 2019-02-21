package qatestjava;


import java.util.Arrays;

/**
 * @author neerupa
 * 
 * Method to check if two strings are Anagrams
 *
 */
public class AnagramString {
	
	public boolean checkAnagram(String s1,String s2) {
		boolean status=false;
		
		char[] strcomp1= s1.replaceAll(" ","").toLowerCase().toCharArray();
		char[] strcomp2=s2.replaceAll(" ", "").toLowerCase().toCharArray();
		
		
		if(strcomp1.length != strcomp2.length) {
			
			return status;
		}
		Arrays.sort(strcomp1);
		Arrays.sort(strcomp2);
/*		@neerupa
 		We can also loop through each array to compare the characters in the string as below
 		I also provided other way to compare both arrays using the Arrays.equals method
 		
 		for(int i=0; i< strcomp1.length;i++) {
			if (strcomp1[i] != strcomp2[i])
				return status;
			else
				status=true;
		}
		*/
		
		return (Arrays.equals(strcomp1, strcomp2));
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnagramString s=new AnagramString();
		System.out.println(s.checkAnagram("bad credit", "debit card"));
		System.out.println(s.checkAnagram("Desperation", "A Rope Ends It"));

	}

}
