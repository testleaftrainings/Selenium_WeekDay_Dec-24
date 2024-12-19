package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		//ctrl+shift+o
		ChromeDriver driver=new ChromeDriver();

		//EdgeDriver driver= new EdgeDriver();
		//FirefoxDriver driver= new FirefoxDriver();
	
		//Load the url
		driver.get("https://www.google.com");
		
		//Maximize the screen
		driver.manage().window().maximize();
		
		//java wait
		Thread.sleep(3000);
		
		//close browser
		driver.close();
		
		
		
		
		
		
	}

}
