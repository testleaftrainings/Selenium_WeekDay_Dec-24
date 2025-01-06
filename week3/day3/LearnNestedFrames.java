package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrames {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//first frame 
		driver.switchTo().frame(2);
		
		//second frame
		driver.switchTo().frame("frame2");
		
		//NoSuchElementException
		driver.findElement(By.id("Click")).click();
		
		//switch back to parent frame
		driver.switchTo().parentFrame();
		
		
		//switch back to main page 
		driver.switchTo().defaultContent();
		driver.findElement(By.id("menuform:j_idt37")).click();
		
		
	}

}
