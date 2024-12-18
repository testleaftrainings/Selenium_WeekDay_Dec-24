package week1.day3;

public class OtherStringMethods {

	public static void main(String[] args) {

		String data="SelectClass";
		//toLowerCase
		String lc = data.toLowerCase();
		System.out.println("Lower Case :"+ lc);
		
		//toUpperCase
		String uc = lc.toUpperCase();
		System.out.println("Upper Case :"+uc);
		
		//replace
		String ai="Gen AI";
		String replace = ai.replace('e', 'E');
		System.out.println(replace);
		
		//repalceAll
		String val="DiliPKumar89$";
		String replaceAll = val.replaceAll("[^A-Za-z0-9]", "T");
		System.out.println(replaceAll);
		
		//split
		String value="Welcome to Testleaf";
		//WelcometoTestleaf
		String[] split = value.split(" ");
		//Welcome  == //W lcom  to T stl af
		//to
		//Testleaf
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
		
		//System.out.println();
		//value.replace(' ', '');
		String replaceAll2 = value.replaceAll("[ ]", "");
		System.out.println("\n"+replaceAll2);
		
		 
		
		
	}

}
