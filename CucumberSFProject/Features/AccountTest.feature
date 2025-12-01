Feature: Accounts and view in Salesforce Application

  Background: Launch into the application
    Given User Launch the browser
    Given User is on "LoginPage" 
    Then User enter into the textbox "Username" "vijitest@ad.com"
    Then User enter into the textbox "password" "password@890"
    Then User click on the button "Login"
    Then verify login with valid credentials
    
  
	Scenario:TC11 User Creates an Account
		
		Given User is on "HomePage" 
		Then User waits
		Then User wait and click on button "accounttab"
		 Given User is on "AccountPage"
		Then User wait and click on button "newbutton"
		Then User enter into the textbox "AccountName" "reshma"
		Then User selects the dropdown "Typedropdown"  "Technology Partner"
		Then User selects the dropdown "CustomerPrioritydropdown"  "High"
		Then User click on the button "accsave"
		Then User closes the browser
		
		 
		Scenario:TC12 User Creates new view
		Given User is on "HomePage"
		Then User wait and click on button "accounttab"
		Given User is on "AccountPage"	
		Then User click on the button "createnewview"
		Then User enter into the textbox "ViewName" "banking"
		Then User enter into the textbox "ViewUniqueName" "1"
		Then User click on the button "viewsave"
		Then User closes the browser
		
		
		Scenario:TC13 User  Edits the view
		Given User is on "HomePage"
		Then User wait and click on button "accounttab"
		Given User is on "AccountPage"
		Then User selects the dropdown "viewdropdown"  "banking"
		Then User click on the button "editview"
		Then User enter into the textbox "ViewName" "bankingnewview"
		Then User enter into the textbox "ViewUniqueName" "bankingnewview1"
		
		Then User selects the dropdown "fielddropdown"  "Account Name"
		Then User selects the dropdown "operatordropdown"  "contains"
		Then User enter into the textbox "value" "a"
		Then User click on the button "save"
		Then User closes the browser
		
		@Run  
  	Scenario:TC14 User Merge the Accounts with similar name
		Given User is on "HomePage"
		Then User waits
		Then User wait and click on button "accounttab"
		Given User is on "AccountPage" 
		Then User creates new account "newbutton" "AccountName" "reshma1" "Typedropdown"  "Technology Partner" "CustomerPrioritydropdown"  "High" "accsave"
#		Then User waits
#		Then User waits
#		Then User waits
#		Then User waits
#		Given User is on "HomePage" 
#		Then User waits
#		Then User waits
#		Then User waits

		Then User wait and click on button "accounttab"
		Given User is on "AccountPage" 
		Then User waits
		Then User creates new account "newbutton" "AccountName" "reshma2" "Typedropdown"  "Technology Partner" "CustomerPrioritydropdown"  "High" "accsave"
		Then User wait and click on button "accounttab"
		Then User creates new account "newbutton" "AccountName" "reshma3" "Typedropdown"  "Technology Partner" "CustomerPrioritydropdown"  "High" "accsave"
		
	
		Scenario:TC15 User Creates account Report
		Given User is on "HomePage" 
		Then User waits
		Then User wait and click on button "accounttab"
		 Given User is on "AccountPage"
		 Then User click on the button "createreport"
		 Then User click on the button "createfield"
		 Then User click on the button "createdate"
		 Then User click on the button "fromdate"
		 Then User click on the button "fromdatetoday"
		 Then User click on the button "todate"
		 Then User click on the button "todatetoday"
		 Then User click on the button "unsavedreportsave"
		 Then User enter into the textbox "reportname" "Report7"
		 Then User enter into the textbox "uniquereportname" " "
		 Then User enter into the textbox "uniquereportname" "Report9"
		 Then User wait and click on button "saveandrunreport"
		 Then User waits
		 Then User closes the browser
		
		
		
		   