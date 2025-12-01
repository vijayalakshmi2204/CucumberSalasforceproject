Feature:Contacts tab features in  Salesforce Application

  Background: Launch into the application
    Given User Launch the browser
    Given User is on "LoginPage" 
    Then User enter into the textbox "Username" "vijitest@ad.com"
    Then User enter into the textbox "password" "password@890"
    Then User click on the button "Login"
    Then verify login with valid credentials
    
 
  Scenario:TC26 User creates new contact 
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "contactstab"
	Given User is on "ContactsPage"
	Then User click on the button "newbtn"
	Then User enter into the textbox "lastname" "Raja"
	Then User click on the button "compname"
	Then User switches to newwindow 	
	Then User switchtoframe "contactiframe"
	Then User click on the button "accselect"
	Then User switches to currentwindow
	Then User click on the button "save"
	Then User closes the browser
	
	
	Scenario:T27 User  Create newview in the ContactPage 
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "contactstab"
	Given User is on "ContactsPage"
	Then User click on the button "createnewview"
	Then User enter into the textbox "viewname" "viewforrtoday"
	Then User enter into the textbox "viewuniquename" " "
	Then User enter into the textbox "viewuniquename" "viewforrtoday1"
	Then User click on the button "viewsave"
	Then User closes the browser
	

	Scenario:T28 User Checks recently created contact in the ContactPage
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "contactstab"
	Given User is on "ContactsPage"
	Then User selects the dropdown "recent"  "Recently Created"
	Then User closes the browser
	
	Scenario:T29 User Check Mycontacts view in the ContactPage
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "contactstab"
	Given User is on "ContactsPage"
	Then User selects the dropdown "createnewviewdropdown"  "My Contacts"
	Then User click on the button "gobtn"
	Then User closes the browser

  
	Scenario:T30 User View a contact in the contactPage
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "contactstab"
	Given User is on "ContactsPage"
	Then User click on the button "viewcontacts"
	Then User closes the browser
	
	
	Scenario:T31 User Check the Error message if, the required information is not entered while creating a New view in Contact
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "contactstab"
	Given User is on "ContactsPage"	
	Then User click on the button "createnewview"
	Then User enter into the textbox "viewname" "EFGH"
	Then User click on the button "viewsave"
	Then User closes the browser
	
	Scenario:T32 User Checks the Cancel button works in Create New View
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "contactstab"
	Given User is on "ContactsPage"	
	Then User click on the button "createnewview"
	Then User enter into the textbox "viewname" "ABCD"
	Then User enter into the textbox "viewuniquename" " "
	Then User enter into the textbox "viewuniquename" "EFGH"
	Then User click on the button "viewcancel"
	Then User click on the button "createnewviewdropdown"
	Then User closes the browser
	
	
	Scenario:T33 User Checks the Save and NewView
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "contactstab"
	Given User is on "ContactsPage"	
	Then User click on the button "newbtn"
	Then User enter into the textbox "lastname" "Vijay"
	Then User click on the button "accname"
	
	Then User switches to newwindow 
	Then User switchtoframe "contactiframe"
	Then User click on the button "accselect"
	Then User switches to currentwindow	
	Then User waits		
	Then User wait and click on button "save"
	
	Then User closes the browser	
			
			
			
			
			
	
		