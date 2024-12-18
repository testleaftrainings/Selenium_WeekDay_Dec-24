package week1.day3;

public class LearnObject {
	
 public static void main(String[] args) {
	
	 LearnMethods lm=new LearnMethods();
	 
	 lm.startApp("Edge", "google");
	 lm.locateElement("ID");
	 lm.name();
	 String value = lm.value();
	 System.out.println(value);
	 
}
}
