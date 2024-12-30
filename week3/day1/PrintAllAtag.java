package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllAtag {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/link.xhtml");
		
		//collect more than one value 
		//findElement()- 1
		//findElements()- more than one value 
		
		
		//Return type findElements() -> List<WebElement>
		List<WebElement> totalValue = driver.findElements(By.tagName("a"));
		
		//driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		int size = totalValue.size();
		System.out.println("Total a tag :"+size);
		
		for (int i = 0; i <totalValue.size() ; i++) {
			System.out.println(totalValue.get(i).getText());
			
		}
		
	}

}
