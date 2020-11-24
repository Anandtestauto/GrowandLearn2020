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
And Enter phno as <phno>
And Click on FindLeads BUTTON 
And Get the leadid
And click on First Element 
And Click on Delete Button 
And click on Find Leads
And supply the leadid as <leadval>
When Click on FindLeads BUTTON
Then Get the message
And confirm the message


Examples:
|Username|Password|phno|leadval|
|demosalesmanager|crmsfa|9|leadID|
#|demosalesmanager|crmsfa|9|