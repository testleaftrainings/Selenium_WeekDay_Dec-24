package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Login.feature",
glue="stepdefinition" ,publish = true)

//basic report for cucumber - publish =true
//features - set path of your feature file
//glue - given only package of setpdefinition 
public class LoginPage extends AbstractTestNGCucumberTests {

}


//UndefinedStepException -Case sensitive mismatch or its not implemented in your stepdefinition class
