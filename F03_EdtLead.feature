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
And Enter phno as <phno>
And Click on FindLeads BUTTON 
And click on First Element 
And Click on Edit Button 
And Enter Edit company name <Cnmae>
When Click on Submit button
Then get the title
 


Examples:
|Username|Password|phno|Cnmae|
|demosalesmanager|crmsfa|9|CTS|
|demosalesmanager|crmsfa|9|TCS|