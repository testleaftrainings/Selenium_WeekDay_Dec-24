package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/CreateLead.feature",
glue={"stepdefinition","hooks"} ,publish = true)

//basic report for cucumber - publish =true
//features - set path of your feature file
//glue - given only package of setpdefinition 
public class CreatePage extends AbstractTestNGCucumberTests {

}


//UndefinedStepException -Case sensitive mismatch or its not implemented in your stepdefinition class
//DuplicateStepDefinitionException - we cannot duplicate StepDefinition

//pure cucumber project -> 5 packages
//base,features,hooks,runner,stepdefinition

//testng in cucmber -> 4 packages
//use testng annotation 



