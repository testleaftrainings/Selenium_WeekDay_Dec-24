package week3.day1;

//what is keyword to connect interface and class
//class to class -> extends
//class to interface -> implements
public class RemoteWebDriver implements WebDriver {

	public void findElement() {
		System.out.println("FindElement -> store one value");
		
	}

	public void findElements() {
System.out.println("FindElements -> store more than one value");		
	}

	public void close() {
		System.out.println("close the method");
		
	}
	
	public static void main(String[] args) {
		RemoteWebDriver rwd=new RemoteWebDriver();
		
		rwd.findElement();
		rwd.findElements();
		rwd.close();
		rwd.get();
		//for static method -no need to create object for that
		//classname.method() 
		//interface.method()
		WebDriver.quit();
		
	}

}
