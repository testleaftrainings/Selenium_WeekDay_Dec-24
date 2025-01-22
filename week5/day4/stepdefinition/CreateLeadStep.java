package stepdefinition;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStep extends ProjectSpecificMethod{


@When("Click on Crmsfa link")
public void click_on_crmsfa_link() {
	driver.findElement(By.linkText("CRM/SFA")).click();
}

@When("Click on LeadsButton")
public void click_on_leads_button() {
	driver.findElement(By.linkText("Leads")).click();

}

@When("Click on CreateLeadButton")
public void click_on_create_lead_button() {
	driver.findElement(By.linkText("Create Lead")).click();

}

@When("Enter the companyName as {string}")
public void enter_the_company_name_as(String comName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(comName);
	}

@When("Enter the firstName as {string}")
public void enter_the_first_name_as(String fName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	
}

@When("Enter the lastName as {string}")
public void enter_the_last_name_as(String lName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
}

@When("Click on CreateLead")
public void click_on_create_lead() {
	driver.findElement(By.name("submitButton")).click();
}

@Then("Verify the lead is created")
public void verify_the_lead_is_created() {
	String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	
	if(text.contains("Dilip")) {
		System.out.println("Lead is created");
	}else {
		System.out.println("Lead is not created");
	}
	

}

	
	
}
