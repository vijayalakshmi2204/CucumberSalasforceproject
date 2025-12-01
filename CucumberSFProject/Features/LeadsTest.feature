Feature:Leads tab features in  Salesforce Application

  Background: Launch into the application
    Given User Launch the browser
    Given User is on "LoginPage" 
    Then User enter into the textbox "Username" "vijitest@ad.com"
    Then User enter into the textbox "password" "password@890"
    Then User click on the button "Login"
    Then verify login with valid credentials
    
  
  Scenario:TC21 User views leadsTab 
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "leadstab"
	Given User is on "LeadsPage"
	Then User closes the browser
	
	 
  Scenario:TC22 User Validate 'View' drop down list contents
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "leadstab"
	Given User is on "LeadsPage"
	Then User click on the button "leadsview"
	Then User closes the browser
	
	
	Scenario:TC23 User views the Functionality of the Go Button
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "leadstab"
	Given User is on "LeadsPage"
	Then User selects the dropdown "leadsview"  "My Unread Leads"
	Given User is on "HomePage" 
	Then User wait and click on button "profile"
  Then User click on the button "logout"
  Then User waits
  
  Given User is on "LoginPage"
  Then User enter into the textbox "Username" "vijitest@ad.com"
  Then User enter into the textbox "password" "password@890"
  Then User click on the button "Login"
  
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "leadstab"
  Then User closes the browser
  
 
  Scenario:TC24 User Lists the item "Todays Leads" work
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "leadstab"
	Given User is on "LeadsPage"
  Then User selects the dropdown "leadsview"  "Today's Leads"
  Then User click on the button "gobtn"
  Then User waits
  Then User closes the browser
  
  
  Scenario:TC25 User Lists the item "Todays Leads" work
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "leadstab"
	Given User is on "LeadsPage"
	Then User click on the button "newbtn"
	Then User enter into the textbox "lastname" "EFGH"
	Then User enter into the textbox "compname" "EFGH"
	Then User waits
	Then User click on the button "save"
  Then User closes the browser
  
  
  
