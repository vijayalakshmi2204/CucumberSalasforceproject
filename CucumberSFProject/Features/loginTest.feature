Feature: Login to salesforce Application

  Background: Launch into the application
    Given User Launch the browser


  Scenario: TC1Login Error Message
  	Given User is on "LoginPage"
    Then User enter into the textbox "Username" "vijitest@ad.com"
    Then User clears the password "password"
    Then User click on the button "Login"
    Then User closes the browser
  
   Scenario: TC2Login To SalesForce
   	Given User is on "LoginPage" 
    Then User enter into the textbox "Username" "vijitest@ad.com"
    Then User enter into the textbox "password" "password@890"
    Then User click on the button "Login"
    Then verify login with valid credentials
    Then User closes the browser
  
		Scenario: TC3Login To SalesForce
		Given User is on "LoginPage"
    Then User enter into the textbox "Username" "vijitest@ad.com"
    Then User enter into the textbox "password" "password@890"
    Then User checks the textbox  "rememberme"
    Then User click on the button "Login"
    Then verify login with valid credentials
    Given User is on "HomePage"
    Then User wait and click on button "profile"
    Then User click on the button "logout"
    Then User closes the browser
    
		Scenario:TC4Testforgotpassword
		Given User is on "LoginPage"
    Then User enter into the textbox "Username" "vijitest@ad.com"
    When User click on the button "forgotpassword"
    Then User enter into the textbox "fpusername" "vijitest@ad.com"
    Then User click on the button "cn"
    Then User closes the browser
     
 	
 		Scenario: TC5wrongusername and Password4B
   	Given User is on "LoginPage" 
    Then User enter into the textbox "Username" "123"
    Then User enter into the textbox "password" "22321"
    Then User click on the button "Login"
    Then verify login with valid credentials
    Then User closes the browser