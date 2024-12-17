package week1.day2;

import java.util.Arrays;

public class FindDuplicateValues {

	public static void main(String[] args) {

		int[] all= {12,45,23,12,56,78,34,23,56,90};
		//12,56,23
		//nest for loop or single for loop
		//if condition
		//print the duplicate value

		//outer for loop
		//12
		//45
		//23
		//12
		for (int i = 0; i < all.length; i++) {
			
			//inner for loop
			//45,23,12,56,78,34,23,56,90
			//23,12,56,78,34,23,56,90
			//12,56,78,34,23,56,90
			//56,78,34,23,56,90
			for (int j = i+1; j < all.length; j++) {
				
				if(all[i]==all[j]) {
					System.out.println("Duplicate value :"+all[j]);
				}
			}
			
		}
		
		Arrays.sort(all);
		//12,12,23,23,34,45,56,56,78,90
		for (int i = 0; i < all.length-1; i++) {
			if(all[i]==all[i+1]) {
				//arr[9]==arr[9+1] => arr[9]==arr[10]
				System.out.println(all[i+1]);
			}
			//ArrayIndexOutOfBoundsException - check length of the array
		}
		
		
		
		
		
		
		
	}

}
