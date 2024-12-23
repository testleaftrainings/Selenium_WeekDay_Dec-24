package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.leafground.com/select.xhtml");
	
	//ctrl +2 -> local varaiable
	//return type findElement -> WebElement
WebElement dd = driver.findElement(By.className("ui-selectonemenu"));
	
	//Create Object for select Class
	Select op=new Select(dd);
	
	//op.selectByIndex(2);
	op.selectByVisibleText("Cypress");
	
	Thread.sleep(2000);
	
	//Non-select tag 
	driver.findElement(By.id("j_idt87:country_label")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("j_idt87:country_4")).click();
	
	
	
	
	}

}
