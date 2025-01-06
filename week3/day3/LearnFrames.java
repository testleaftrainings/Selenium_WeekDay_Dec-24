package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//index value start from '0'
		driver.switchTo().frame(0);
		
		//NoSuchElementException
		driver.findElement(By.id("Click")).click();
		
		//switch back to main page 
		driver.switchTo().defaultContent();
		driver.findElement(By.id("menuform:j_idt37")).click();
		
		
	}

}
