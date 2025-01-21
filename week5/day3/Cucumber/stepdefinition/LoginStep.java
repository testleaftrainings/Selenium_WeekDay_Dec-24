package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	public ChromeDriver driver;
	
	@Given("launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@When("Enter the username as Demosalesmanager")
	public void enter_the_username_as_demosalesmanager() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
  
	}
	@When("Enter the password as crmsfa")
	public void enter_the_password_as_crmsfa() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");

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
}
