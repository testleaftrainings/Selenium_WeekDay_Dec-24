package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		//
		Alert alert = driver.switchTo().alert();
		
		String alertMessage = alert.getText();
		System.out.println(alertMessage);
		
		//driver.switchTo().alert().accept();
		//simple alert -> one button
		alert.accept();
		
		String text = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		
		Thread.sleep(2000);
		
		//confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		alert.dismiss();
		
		String cmf = driver.findElement(By.id("result")).getText();
		System.out.println(cmf);
		
		
		
	}

}
