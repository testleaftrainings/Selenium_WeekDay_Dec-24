week5.day4

Cucumber Framework:


Static Parmeterization:

2 Scenario - pass different data single quotes

the value 'Demosalesmanager' and 'crmsfa' -inside feature file



in your StepDefinition Class
@When("Enter the username as Demosalesmanager)

@When(Enter the userName as {string})
public void username(String username){
driver.findElement(By.id("username").sendKeys(username);

}



How to pass multiple data using Scenario Outline and Examples :
1. To pass multiple data for a single scenario the Gherkins keyword used is Scenario Outline
2. In Scenario Outline identify the dynamic data and replace that with <>
    ex: <companyName> <username>
	<password>
	<firstname>
3. Under Examples keyword create pipeline symbol and mention the column name
   ex: |companyName|firstname|
   Note: The name should exactly match
    -Pass the values in the second row of Examples
    ex: |'TestLeaf'|'Dilip'| (1st set of data)
        |'Qeagle'|'Dilip'|   (2nd set of data)
                                                     
4.Go to the Step Definition and replace <companyName> with {string}-only string
5.Pass Input arguments to the method and replace the hardcoded value withe the argument   


io.cucumber.java.InvalidMethodException: You're not allowed to extend classes that define Step Definitions or hooks. class stepdefinition.CreateLeadStep extends class stepdefinition.LoginStep


java.lang.NullPointerException
driver value is not properly set to the class level
LoginStep - driver value is passed(d1)
CreateStep - driver issue(d1)

inside PSM 
make driver variable change to static driver - to reslove this nullpointer exception
 
 Feature:
 SC1 Positive Scenario - use Dynamic Parameter
 Sc2 Negative Scenario - use static parameter

demosalesmanager crmsfa
democsr          crmsfa











ChromeDriver: chrome on windows (e67fe29b3c38bb681e6b2fa99e65d116)

ChromeDriver: chrome on windows (e67fe29b3c38bb681e6b2fa99e65d116)

Create PSM 
add driver vlaue 
declare driver as static variable .




Hooks Implementation: Before TestNG intro
   Cucumber Annotations - > Hooks in Ruby Language
   its run before the scenario and after scenario
   Hooks:
       @Before :
          -is to have common precondition for each scenario
        @After : 
           - is to have common postcondition for each scenario


Steps to implement Hooks:
*Create a package called hooks and create a class called HooksImplementation
*Create 2 methods preCondition() and postCondition() and annotate with @Before and @After
*The Hooks class should extends BaseClass or PSM
*Add code inside precondition and postcondition and command out line feature file and stepDefinition
*In the Runner class inside glue attribute mention hooks package as well glue ={"steps","hooks"}


io.cucumber.java.InvalidMethodException: 
	You're not allowed to extend classes that define Step Definitions or hooks. 
  class stepDefinition.CreateLeadSD extends class stepDefinition.Hooks

io.cucumber.java.InvalidMethodException: You're not allowed to extend classes that define Step Definitions 
or hooks. class stepDefinition.CreateLeadPage extends class hooks.HooksImplementation


PSM-call the driver instance and extends to hooks,stepDefinition

ClassRoom1 :

Step-1 Add TestNG Annotation BeforeMethod and AfterMethod
Step-2 And copy code and paste inside perCondition and postCondition
Step-3 Command the common line in the feature file and steps package(launch browser and load url)
Step-4 Extends -> Runnerclass to BaseClass or PSM
BaseClass or PSM extends AbstractTestNGCucumberTests
Step-5 And executed from the runnerclass


Tags:
It is used to categorize the scenario

feature file: 

@smoke
S-Login->run

@dilip
S-CreateLeadPage

@smoke @sanity
S-editLead->run

@sanity @dilip @smoke
S-DeleteLead


Inside Runner :

tags="@dilip"-> CreateLeadPage

tags="@smoke" or "@sanity" -> Login,edit,delete
or-> 

tags="not @smoke" -> CreateLeadPage

tags="@sanity and @smoke" -> edit ,delete






tags="@smoke" )// only smoke scenarios will be executed 
tags="not @smoke")// it will exclude asmoke scenario  from execution
tags="@smoke or @functional") // To run scenarios that have either of the tags
tags="@functional and @regression" ) //To run scenarios which has both the tags