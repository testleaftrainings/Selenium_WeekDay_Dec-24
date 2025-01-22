package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/CreateLead.feature",
glue={"stepdefinition"} ,publish = true)


public class CreatePageWithHooks extends ProjectSpecificMethod {

}

//cucumber runner class should extends PSM
//PSM should extends AbstractTestNGCucumberTests
 



