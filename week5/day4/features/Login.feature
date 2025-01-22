Feature: Test LeafTaps Application for Login Scenario

#common data for all the scenario 
#BackGround - will run before all the Scenario and Scenario outline

#if you have adding common line in PSM 
#Background:
#Given launch the browser and load the url

#Tags -> @name
# @smoke, @sanity,@dilip

@dilip @smoke
Scenario: Login with Positive Data
When Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then Verify the title of the page


@sanity
Scenario: Login with Negative Data
When Enter the username as 'Demosales'
And Enter the password as 'crmsfa'
And Click on LoginButton
But Verify the title of the page not successfull

