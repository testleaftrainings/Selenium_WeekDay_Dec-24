package week1.day3;

public class LearnStringMethods {

	public static void main(String[] args) {
		
		String name="Test Leaf";
		
		String comName=new String("Test Leaf"); //=>450
		
		//length
		int stringLength = name.length();
		System.out.println("Length of the String :"+stringLength);
		
		//contains
		boolean contains = name.contains("test");
		System.out.println("Contains methods :"+contains);
		
		//charAt
		//index value start- '0'
		char charAt = name.charAt(6);
		System.out.println("CharAt method :"+charAt);
		
		
		//equals
		String value="Test Leaf";//=> 560
		if(value.equals(name)) {
			System.out.println("Data is equal");
		}else {
			System.out.println("Data is not equal");
		}
		
		//b/w == and .equals()
		//== -> check memory address of the String value
		//.equals() -> check  String content
		
		if(value==comName){
			System.out.println("Data is equal");
		}else {
			System.out.println("Data is not equal");
		}
		
		//EqualIgnoreCase
		String d1="Dilip";
		
		String d2="diLiP";
		if(d1.equalsIgnoreCase(d2)) {
			System.out.println("Data is equals and ignore Case");
		}else {
			System.out.println("Data is nor Equals ");
		}
		
		//toCharArray
		String val="Selenium";
char[] ch = val.toCharArray();
for (int i = 0; i < ch.length; i++) {
	System.out.print(ch[i]);
}
//muineleS

System.out.println();


for (int i = ch.length-1; i >=0 ; i--) {
	System.out.print(ch[i]);
}

		
		
		
		
		

	}

}
