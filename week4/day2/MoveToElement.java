package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		
		WebElement mouseOver = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
		
		//Object Actions class
		Actions act=new Actions(driver);
		
		//object.method()
		//missed .perform() - action will  not complete
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Home & Kitchen']"))).perform();
		//act.moveToElement(driver.findElement(By.xpath("//span[text()='Home & Kitchen']")))
		
		
		driver.findElement(By.xpath("//span[text()='Juicer Mixer Grinders']")).click();
		
	
	
	}

}
