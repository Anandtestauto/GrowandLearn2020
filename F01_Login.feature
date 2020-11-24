Feature: Leaftab login functionality

#Background:
#Given launch the chrome browser  
#And Load application URL


Scenario Outline: Login with  postive credentials
Given Enter username as <Username> 
And Enter password as <Password> 
When Click on Login button
Then Homepage should be displayed
Examples:
|Username|Password|
|demosalesmanager|crmsfa|
#|demoCSR|crmsfa|


#Scenario Outline: Login with  negative credentials
#Given Enter username as <Username>  
#And Enter password as <Password>  
#When Click on Login button  
#But Error page should be displayed
#Examples:
#|Username|Password|
#|demosalesmanager|crmsfa123|
#|demoCSR|crmsfa123|