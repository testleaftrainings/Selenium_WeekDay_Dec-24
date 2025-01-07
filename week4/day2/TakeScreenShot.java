package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		
		WebElement df = driver.findElement(By.xpath("//div[@class='cartInner']"));
		
		File scr = df.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("./SnapShot/image1.png");
		
		FileUtils.copyFile(scr, dest);
		
		
		
	}

}
