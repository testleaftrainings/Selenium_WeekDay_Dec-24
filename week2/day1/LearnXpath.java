package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//selenium wiat Implicity
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//input[@id='username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("Leaftaps")) {
			System.out.println("Login is successful");
		}else {
			System.out.println("Login is not successful");
		}
		
		//org.openqa.selenium.InvalidSelectorException -xpath syntax mistake
		//org.openqa.selenium.NoSuchElementException - locator value is miss match
		
		//how to get text from application
		//String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		//System.out.println(text);
	}

}
