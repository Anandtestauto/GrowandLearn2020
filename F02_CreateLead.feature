Feature: Leaftab createLead functionality




Scenario Outline: Create Lead with mandatory fields
  
Given Enter username as <Username>  
And Enter password as <Password> 
When Click on Login button
Then Homepage should be displayed
When click on CRM/SFA link 
Then My Home page should be displayed
When click on Lead page
Then create lead page should be displayed
Given Enter company name <cname>
And Enter first name as <fname>
And Enter Last name as <Lname>
When click on submit button
Then  Created Lead page should be displayed



Examples:
|Username|Password|cname|fname|Lname|
|demosalesmanager|crmsfa|testleaf|hari|babu|
|demosalesmanager|crmsfa|testleaf|sam|jacob|