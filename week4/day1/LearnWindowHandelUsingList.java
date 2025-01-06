package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandelUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//getWindowHandle -> window id it will be store -1
		String pw = driver.getWindowHandle();
		System.out.println("Parent id :"+pw);
		System.out.println(driver.getTitle());
		
		
		//getWindowHandles
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		
		//pass my control to child window
		//convert set into list
		List<String> passChild=new ArrayList<String>(allWindow);
		
		//index value start from '0'
		//parent -0
		//child -1
		driver.switchTo().window(passChild.get(1));
		System.out.println("Child title : "+driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("dilip@testleaf.com");
		
		//how many windows its closing - current window/tab
		driver.close();
		
		//switch back to parent window
		
		driver.switchTo().window(passChild.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		//quit - will close all opened window/tab
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
