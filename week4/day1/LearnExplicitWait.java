package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/waits.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		WebElement findValue = driver.findElement(By.id("j_idt87:j_idt90"));
		
		
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement until = w.until(ExpectedConditions.visibilityOf(findValue));
		
		String text = until.getText();
		System.out.println(text);
		
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		
		WebElement inv = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		
		Boolean until2 = w.until(ExpectedConditions.invisibilityOf(inv));
		System.out.println(until2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
