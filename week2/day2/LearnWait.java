package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWait {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com"); //10sec
		driver.findElement(By.id("password")).sendKeys("leaf@2024"); //7sec
		driver.findElement(By.id("Login")).click();//15sec
		driver.findElement(By.xpath("//span[text()='Get Started']")).click();
		
	}

}
