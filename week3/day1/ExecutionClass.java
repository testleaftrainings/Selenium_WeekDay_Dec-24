package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutionClass extends RemoteDriver{

	//100% all method should be implemented 
	
	public static void main(String[] args) {
		ExecutionClass ec=new ExecutionClass();
		ec.close();
		ec.findElement();
		ec.findElements();
		ec.frame();
		ec.get();
		ec.window();
		WebDriver.quit();
		
	//	ChromeDriver driver=new ChromeDriver();
		
		
	}

	@Override
	public void close() {
System.out.println("Execution Close");		
	}

	@Override
	void window() {
System.out.println("Execution window");		
	}

}
