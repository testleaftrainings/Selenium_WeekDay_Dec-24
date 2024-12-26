package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebDriverMethods {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		
		String title = driver.getTitle();
		System.out.println("title of the page :"+title);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
		
		String text = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println("Get text from application :"+text);
	
		String replaceAll = text.replaceAll(",", "");
		System.out.println("Replace value ',' "+replaceAll); //19444
	
		//string value into integer 
		int parseInt = Integer.parseInt(replaceAll);
		System.out.println("Integer value :"+parseInt);
		
		//print current page url 
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		driver.close();
		
	}

}
