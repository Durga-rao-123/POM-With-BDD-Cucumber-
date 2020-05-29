Feature: Importing IdentityIq Report provider

Scenario: IdentityIq report Importing Validation
   Given user open Browser
   Then user is on login page
   When user enter username and password
   Then user click on Login button
   Then user is on Home Page And validate title
   When user click  on Add newClient Button
   Then user is on Add NewClient page
   When user enter firstname and lastname
   When user click on client has no email
   When user click on submit button
   Then user should see warning message
   When user click on ok button
   Then user should see Client Dashboard page
   When user click on 1-click import and audit
   Then user should see Enter&confirm credit monitoring access details page
   When user click on dropdown and select identityiq
   When user enter username and password and security word
   When user click on import run and simple audit
   
   
   

  
 
       

 