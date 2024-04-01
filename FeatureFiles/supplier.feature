Feature:
As Admin user login to stock project
and should validate supplier
@SupplierTest
Scenario Outline:
Validate Supplier with multiple data
Given user navigate browser
When user launch url "http://webapp.qedgetech.com/" in a browser
When user wait for username with "name" and "username"
When User enter username with "name" and "username" and "admin"
When user enter password with "xpath" and "//input[@id='password']" and "master"
When user click login button with "id" and "btnsubmit"
When user wait for supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When user click supplier link with "xpath" and "(//a[contains(text(),'Suppliers')])[2]"
When user wait for Add icon with "xpath" and "(//span[@data-caption='Add'])[1]"
When user click add icon with "xpath" and "(//span[@data-caption='Add'])[1]"
When user wait for supplier number with "name" and "x_Supplier_Number"
When user capture supplier number with "name" and "x_Supplier_Number"
When Enter in "<SupplierName>" with "id" and "x_Supplier_Name" 
When Enter in "<address>" with "xpath" and "//*[@id='x_Address']" 
When Enter in "<city>" with "xpath" and "//*[@id='x_City']" 
When Enter in "<country>" with "xpath" and "//*[@id='x_Country']" 
When Enter in "<cperson>" with "xpath" and "//*[@id='x_Contact_Person']" 
When Enter in "<pnumber>" with "xpath" and "//*[@id='x_Phone_Number']" 
When Enter in "<mail>" with "xpath" and "//*[@id='x__Email']" 
When Enter in "<mnumber>" with "xpath" and "//*[@id='x_Mobile_Number']" 
When Enter in "<note>" with "xpath" and "//*[@id='x_Notes']"
When Click Add button with "id" and "btnAction"
When Wait for Confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When click Confirm ok button with "xpath" and "//button[normalize-space()='OK!']"
When Wait for alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When Click alert ok button with "xpath" and "(//button[starts-with(text(),'OK')])[6]"
When Validate supplier table
When Click Logout link with "xpath" and "(//a[starts-with(text(),' Logout')])[2]"
When close browser
Examples:
|SupplierName|address|city|country|cperson|pnumber|mail|mnumber|note|
|Akhilesh1|srnagar6|Hyderabad1|India|Qedge1|9876543211|Test@gmail.com|765432123|supply goods|
|Akhilesh4|srnagar|Hyderabad1|India|Qedge1|9876543211|Test@gmail.com|765432123|supply goods|
|Akhilesh6|srnagar|Hyderabad1|India|Qedge1|9876543211|Test@gmail.com|765432123|supply goods|
|Akhilesh6|srnagar0|Hyderabad1|India|Qedge1|9876543211|Test@gmail.com|765432123|supply goods|

