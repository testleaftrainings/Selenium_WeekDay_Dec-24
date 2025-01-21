package week5.day3;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod{
	
	@BeforeTest
	public void getValue() {
		fileName="CreatedLeadSheet";
	}
	
    @Test(dataProvider = "SetValues")
	public  void runCreateLead(String cName,String fName,String lName) {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.name("submitButton")).click();
		
}
    
   
}






