package week3.day2;

public class LearnStatic {
	
	//common Reference inside this class
	static String CompanyName="Qeagle"; 
	
	//non -static variable
	String name="Dilip";
	
	
	//static method
	public static void data() {
		System.out.println(CompanyName);
	}
	
	
	//non-static method
	public void add() {
		System.out.println("Non-static method");
		System.out.println(name);
	}
	
	
	static {
		System.out.println("its static block");
	}
	

	public static void main(String[] args) {
		
		//static method - directly call inside main method
		data();
		
	
		//ClassName.variableName
	System.out.println(LearnStatic.CompanyName);
	
	System.out.println(LearnStatic.CompanyName);
	
	//non-static method or variable -i need create object
	LearnStatic ls=new LearnStatic();
System.out.println(ls.name);
	ls.add();
	
	

	}

}
