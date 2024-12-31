package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateValues {

	public static void main(String[] args) {

		String[] name= {"java","selenium","cucumber","java","testng","selenium","pom"};
		
		Set<String> unqVal=new TreeSet<String>();
		
//		for (int i = 0; i < name.length; i++) {
//			
//		}
		//for each 
		//for(String  unq :name)
		for (String i : name) {
			unqVal.add(i);
		}
		
		System.out.println(unqVal);
		
		//print index of 2 
		//convert set into list
		List<String> getValue=new ArrayList<String>(unqVal);
		String string = getValue.get(2);
		System.out.println("index of 2 :"+string);
		

	}

}
