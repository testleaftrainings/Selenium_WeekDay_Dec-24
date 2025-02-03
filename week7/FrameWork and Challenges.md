

Top  Challenges that I faced during automation [STAR Approach - Situation Task Action Result]:

1) Stale Element Reference Exception

Situation: While automating 400+ tests and running them using Selenium Grid, I noticed several tests failing with Stale Element Reference exception and this caused lot of rework in the test automation project. 

Task: Have to find the rootcause of this problem and fix it [Not having deeper understanding] !! 

Root Cause: When the element was looked for its presence by findElement, the element was there. But it got disappeared, when you were about to interact with the element - sendKeys, click, clear !! 

Action: 

Option 1) Either add sleep statement before find the element [How long?]
Best Option) Whenever there is stale element reference exception, find the element again !! 

Option 2) 
try{
	driver.findElement(By.id("username")).sendKeys("Dilip");
}
catch(Exception e){
driver.findElement(By.id("username")).sendKeys("Dilip");
}

Option 3) We use WebDriverWait

Result:

This solved most of the common failures and the test automation results were helpful to speed up the testing efforts !! You are awarded 'STAR Award' !!



2) Upload file using WD  

Situation: In my application, in multiple places - we had uploading files and unfortunately, the Selenium WebDriver does not support the windows or MAC elements (as it can only talk to browser), so we could not automate these well. 

Task: Find workaround or solution that can asist to automate such uploads !!

Action:

Solution 1: Using java.awt.Robot -> Keyboard or mouse action to interact with Windows (You cannot run in parallel)
Solution 2: Using Sikuli / AutoIt -> Record the windows element and help you to upload (Very flaky)
Solution 3: Using file upload through input element //input[@type='file'] and send the file location and file name using sendKeys

This works when you have multiple parallel execution and/or when executed in multiple machines and also when running in hidden mode

Result: You could automate more scenarios without failures due to selenium non-support






3)Enhance framework with dynamic test data

Situation: We are using Excel to keep the data. Which is providing static data to the test cases. Client has raised this a concern as data whatever we create using automation looks like junk data in data base

Task: I was asked to implement dynamic data for the test cases

Action: I have explored APIs and libraries to dynamic data  and implemented faker one of the java library. Faker is very simple and easy to implement in our framework. 

Result: Data created using Faker is dynamic and looks like real data.








