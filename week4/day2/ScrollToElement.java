package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books",Keys.ENTER);
		
		//tab
		WebElement se = driver.findElement(By.xpath("//span[text()='Books related to your search']"));
		
		Actions act=new Actions(driver);
		act.scrollToElement(se).perform();
		
		driver.findElement(By.xpath("//div[@class='_bXVsd_container_36eK4']")).click();
	
	}

}
