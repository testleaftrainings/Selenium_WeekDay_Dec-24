package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends ProjectSpecificMethod{
	
	

	@When("Enter the username as {string}")
	public void enter_the_username_as_demosalesmanager(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
  
	}
	@When("Enter the password as {string}")
	public void enter_the_password_as_crmsfa(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);

	}
	@When("Click on LoginButton")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	@Then("Verify the title of the page")
	public void verify_the_title_of_the_page() {
	   
		String expectedTitle=driver.getTitle();
		if(expectedTitle.contains("Leaftaps")) {
			System.out.println("Login is Successfull");
		}else {
			System.out.println("Login not Successfull");
		}
	}
	
	
	@But("Verify the title of the page not successfull")
	public void verifytheTitle() {
		String expectedTitle=driver.getTitle();
		if(expectedTitle.contains("Leaftaps")) {
			System.out.println("Login not Successfull");
		}else {
			System.out.println("Login is Successfull");
		}
	}
	
	
	
}
