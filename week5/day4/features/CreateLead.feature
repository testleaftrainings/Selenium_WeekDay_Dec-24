Feature: Test LeafTaps Application for CreateLead Scenario

Scenario Outline: Create Multiple Leads

#Given launch the browser and load the url
When Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
And Click on LoginButton
Then Verify the title of the page
When Click on Crmsfa link
And Click on LeadsButton
And Click on CreateLeadButton
And Enter the companyName as <cname>
And Enter the firstName as <fname>
And Enter the lastName as <lname>
And Click on CreateLead
Then Verify the lead is created

Examples:
|cname|fname|lname|
|'TestLeaf'|'Dilip'|'Kumar'|
|'Qeagle'|'Dilip'|'Kumar'|


