week4.day4:


-> Annotations 
-> Breakout 
-> Attributes(priority,enabled,invocationCount,threadPoolSize,dependsonMethods,Alwaysrun)


TestNG Annotations:

@BeforeSuite

@BeforeTest

@BeforeClass

@BeforeMethod 



     @Test   



@AfterMethod 
@AfterClass

@AfterTest

@AfterSuite

Before Suite Before Test Before Class

Before Method

Testcase 1

After Method

Before Method

Testcase 2 After Method

Before Method Testcase 3 After Method

After Class After Test

-> @BeforeSuite

-> @BeforeTest

<classes> -> @BeforeClass 

     

    <class> -> @BeforeMethod 



       @Test -> @Test 



 </classes> -> @AfterClass 
-> @AfterTest

-> @BeforeTest

<classes> -> @BeforeClass 

     

    <class> -> @BeforeMethod 



       @Test -> @Test 



 </classes> -> @AfterClass 
-> @AfterTest

-> @AfterSuite

Before Suite Before Test Before Class Before Method Testcase 1 After Method After Class After Test

Before Suite Before Test Before Class

Before Method Testcase 1 After Method

Before Method Testcase 2 After Method

After Class After Test

Before Suite Before Test Before Class Before Method Testcase 1 After Method Before Method Testcase 2 After Method After Class After Test

Before Test Before Class Before Method Testcase 1 After Method Before Method Testcase 2 After Method After Class After Test After Suite

Step:1 Create a class as ProjectSpecificMethod

Step:2 Move all the common steps to common class (remove those steps in testcases)

Step:3 @BeforeMethod and @AfterMethod annotation to define the preCondition and postCondition Methods

Step:4 Extend the base class to leads classes