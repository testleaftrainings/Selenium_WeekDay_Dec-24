package week1.day3;

public class LearnMethods {
	
	public void startApp(String browser,String url) {
		
		System.out.println(browser +" \n"+url);
	}
	
	private int browserCount() {
		return 2;
		}
	
	void locateElement(String value) {
		System.out.println("Default AM");
	}
	
	protected void name() {
		System.out.println("Protected AM");
	}
	
	public String value() {
		return "Dilip";
		
	}
	
	public static void main(String[] args) {
		
		//create object for Classname
		LearnMethods lm=new LearnMethods();
		
		//objName.methodName();
		
		//if you have used dataType for the method -we cannot print directly
		//object.method() - we cannot do
		//store inside local variable
		int bc = lm.browserCount();
		System.out.println(bc);
		
		String value = lm.value();
		System.out.println(value);
		
		lm.name();
		lm.locateElement("Xpath");
		lm.startApp("Chrome", "www.google.com");
	}

}
