package week1.day1;

public class Browser {

	//if variable created inside class-> globally variable
	int num=56;
	
	public static void main(String[] args) {

		// dataType variableName= value
		//variableName if its created inside main method -> local variable
	int noOfTaps=5;
	char browserLogo='C';
	boolean appLoaded=true;
	float browserVersion=131.67f; //f or F 
	double ap=3.33333333333333333333333;
	long phNo=8776889790L;//l or L
	String appName="platform.testleaf.com";
	
	System.out.println("Number of Taps opened in the browser :"+noOfTaps);
	
	System.out.println("Get Browser Logo :"+browserLogo);
	
	System.out.println("Phone Number :"+phNo +"\n"+ "Application name:"+appName);
	
	}

}
