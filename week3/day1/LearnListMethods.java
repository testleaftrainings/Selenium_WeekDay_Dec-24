package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnListMethods {

	public static void main(String[] args) {
		
		List<String> mentorName=new ArrayList<String>();

		//add
		mentorName.add("Dilip");
		mentorName.add("Anbu");
		mentorName.add("Harrish");
		mentorName.add("Bhuvanesh");
		mentorName.add("Vinoth");
		mentorName.add("Dilip");
		mentorName.add("Anbu");
		mentorName.add("Harrish");
		
		System.out.println(mentorName);
		
		//index value start from -> '0'
		mentorName.add(4, "Gokul");
		
		System.out.println("Added new name :"+mentorName);
		
		
		//get()
		String string = mentorName.get(2);
		System.out.println("Value print based on Get(2) :"+string);
		
		//size()
		int size = mentorName.size();
		System.out.println("Print list size :"+size);
		
		//contains
		boolean contains = mentorName.contains("Vinoth");
		System.out.println("Contains :"+contains);
		
		//remove
		String remove = mentorName.remove(6);
		System.out.println("Remove index of 6 :"+mentorName);
		
		//sort
		Collections.sort(mentorName);
		for (int i = 0; i < mentorName.size(); i++) {
			System.out.println(mentorName.get(i));
			
		}
		
		//clear
		mentorName.clear();
		System.out.println(mentorName);
		
	}

}
