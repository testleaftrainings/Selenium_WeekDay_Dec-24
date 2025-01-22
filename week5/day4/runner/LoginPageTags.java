package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/Login.feature",
glue="stepdefinition" ,publish = true, tags="@dilip and @smoke")

//@sanity -1(N)
//@sanity or @dilip -2(P,N)
//not @smoke - 1(it will execute other scenario
//@dilip and @smoke -1(P)
 
public class LoginPageTags extends ProjectSpecificMethod {

}

