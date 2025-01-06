package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandelUsingTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//getWindowHandles
		Set<String> windowHandles = driver.getWindowHandles();
		
		//which window i need switch
		//set the Title of the child window
		String cw="Dashboard";
		String cw1="WebTable";
		
		//iterate through all window
		
		for (String childWindow : windowHandles) {
			driver.switchTo().window(childWindow);
			if(driver.getTitle().equals(cw)) {
				driver.findElement(By.id("email")).sendKeys("dilip@testleaf.com");
				//driver.close();
				
			}
		}
		
		
//		//switch to parent window
//		driver.switchTo().defaultContent();
//		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
	}

}
