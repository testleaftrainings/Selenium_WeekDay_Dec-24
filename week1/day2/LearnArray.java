package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		int[] num= {76,79,34,31,12,90};

		//press -> ctrl+2 -> 2nd option
		//find length of the array
		int length = num.length;
		System.out.println("Length of the array :"+length);
		
		//find value index 0
		System.out.println("Find the value index[0] :"+num[0]);
		
		//find last index value
		
		System.out.println("find last index value :"+num[length-1]);
		//num[6-1]=> num[5]
		
		//sort
		Arrays.sort(num);
		//12,31,34,76,79,90
		System.out.println("After sorting the array index[2] :"+num[2]);
		
		
		//print all number from array
		for (int i = 0; i < num.length; i++) {
			
			if(num[i]==79) {
				break;
			}
			
			System.out.println(num[i]);
		}
		
		
		
		
		
		
		
		
	
	
	}

}
