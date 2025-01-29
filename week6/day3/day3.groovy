
 
Extent Report:


<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>3.1.5</version>
</dependency>

is a widely used reporting framework

1.screen shot 
2.information based testcase
3.pic,graph and relevant details
4.stauts pass or fail

step1 :
set path for the report ExtentHtmlReporter
ExtentHtmlReporter wb= new ExtentHtmlReporter("./report/loginReport.html");
step2:
Create object for ExtentReports
ExtentReports repo=new ExtentReports();
step3:
attach the data with physical file (combine step1 and step2)
repo.attach(wb);
step4:
create testcase and adding details about testcase(tc name,tc desp,category,author)
testcasename
testdc
category
author

step5:
step level status(fail,pass)
pubic void enterUsername(){
driver.findElement(By.id("username")).sendKeys("democsr);
}

test.pass(EnterUsername+ snap shot);
test.pass(enterpassword + snap shot)
test.fail(click loginButton + snap shot)

step6:
mandatory close report
flush();
close the extentreports
repo.flush();









Steps to Integrate Extent Report with POM:
1. Create startReport() with @BeforeSuite in BaseClass or PSM and copy step1 to step3 code from extent report
2.Make ExtentReports as global and static variable
3.Create stopReport() with @AfterSuite to have ExtentReports Objectname (extent).flush()
4.Create testDetails() with @BeforeClass for test case details code
5.Declare ExtentTest test as global and static variable
6.Create 4 global variables testName, testDescription, testAuthor and testCategory
7.Relace the hardcoded values with the respective variable names
8.Assign the values for the variables in the setValues() in the testcases @BeforeTest
9.Create reportStep(String stepDetails, String status) in the PSM with conditional implementation for pass / fail
10.methods in pages should have try / catch implementation
11.call the reportStep() with pass status from try block & with pass and fail status
@BeforeSuite -startReport @BeforeTest - testDeatils(name.dscr,aut,cate) @BeforeClass -testDetails,screenShot @DataProvider @BeforeMethod @Test @AfterMethod @AfterClass @AfterTest @AfterSuite -stopReport