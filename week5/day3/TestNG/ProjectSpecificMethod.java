package week5.day3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethod {


	public RemoteWebDriver driver;
	public String fileName;
	
	//you can change the order from xml
	@Parameters({"password","username","url","browser"})
	
	
	@BeforeMethod
	//while creating input agrs you should follow the order @Parameters
	public void preCondition(String pword,String user,String url,String browserValue) {

		
		if(browserValue.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserValue.equals("edge")) {
			driver=new EdgeDriver();
		}
		 
		 
		 
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	
	 
    @AfterMethod
    public void postCondition() {
    	driver.close();
    }
    
    
    
  
  	@DataProvider(name="SetValues",indices = {0})
  	public String[][] fetchData() throws IOException{
  		return DataSheet.readExcel(fileName);
  	}
}
