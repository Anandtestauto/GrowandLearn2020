Feature: Leaftab EditLead functionality




Scenario Outline: EditLead with existing leads fields
  
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
Then click on First Element 
When Click on Edit Button 
Then Enter company name <Cnmae>
When Click on Submit button
Then get the title
 


Examples:
|Username|Password|phno|Cnmae|
|demosalesmanager|crmsfa|9|CTS|
|demosalesmanager|crmsfa|9|TCS|