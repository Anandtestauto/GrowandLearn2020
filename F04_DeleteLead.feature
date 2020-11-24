Feature: Leaftab DeleteLead functionality




Scenario Outline: DeleteLead with existing leads fields
  
Given Enter username as <Username>  
And Enter password as <Password> 
When Click on Login button
Then Homepage should be displayed
When click on CRM/SFA link 
Then My Home page should be displayed
When click on Lead page
Then click on Find Leads
When click on phno tab
Then Enter phno as <phno>
When Click on FindLeads BUTTON 
Then Get the leadid
Then click on First Element 
And Click on Delete Button 
When Click on FindLeads BUTTON
Then supply the leadid
When Click on FindLeads BUTTON
Then Get the message
And confirm the message


Examples:
|Username|Password|phno|
|demosalesmanager|crmsfa|9|
|demosalesmanager|crmsfa|9|