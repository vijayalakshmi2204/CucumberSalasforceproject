Feature: Login to Salesforce Application
Scenario Outline: TC2Login To SalesForce

	  Given User Launch the browser
	  When User enters the username "<username>"
    When User enters the password "<password>"
    And User click on loginbutton
    #Then verify login with valid credentials
    
	
    Examples: 
      |username|password|
      | vijitest@ad.com | password@890 | 
      | admin1234@gmail.com|admin123 | 
