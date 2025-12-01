Feature:Random  scenarios in  Salesforce Application

  Background: Launch into the application
    Given User Launch the browser
    Given User is on "LoginPage" 
    Then User enter into the textbox "Username" "vijitest@ad.com"
    Then User enter into the textbox "password" "password@890"
    Then User click on the button "Login"
    Then verify login with valid credentials
    

  Scenario:T34 Verify the firstname and lastname of the loggedinuser 
  Given User is on "HomePage"
	Then User waits
	Then User wait and click on button "hometab"
	Given User is on "RandomScenariosPage"
	Then User wait and click on button "profilename"
	Then User closes the browser
	Then User closes the browser
	
	
	Scenario:T35 User Verify the edited lastname is updated 
	Given User is on "HomePage"
	Then User waits
	Then User wait and click on button "hometab"
	Given User is on "RandomScenariosPage"
	Then User wait and click on button "profilename"
	Then User wait and click on button "editprofile"
	Then User switchtoframe "editprofileiframe"
	Then User click on the button "aboutbtn"
	Then User enter into the textbox "lastname" "abcd"
	Then User click on the button "savebtn"
	Then User switchTo defaultpage	
	Then User closes the browser
	
	
	Scenario:T36 User Verify the edited lastname is updated 
	Given User is on "HomePage"
	Then User waits
	Then User wait and click on button "hometab"
	Given User is on "RandomScenariosPage"
	Then User wait and click on button "plustab"
	Then User click on the button "customizetab"
	Then User click on the button "removebtn"
	Then User click on the button "savebutton"
	Then User closes the browser
	
	
	@Run
	Scenario:T37 User Blocks an event in the calender 
	Given User is on "HomePage"
	Then User waits
	Then User wait and click on button "hometab"
	Given User is on "RandomScenariosPage"
	Then User click on the button "homecurrentdatelink"
	Then User click on the button "eightoclocklink"
	Then User click on the button "subjectcomboicon"
	Then User switches to newwindow 
	Then User waits
	
	Then User wait and click on button "otherslink"
	Then User switches to currentwindow
	
	Then User click on the button "endtimefielddropdown"
	Then User does mouseover on "endtimeover1"		
	Then User click on the button "endtimeover1"		
	Then User click on the button "save"			
 Then User closes the browser
		

	Scenario:T38  Blocking an event in the calender with weekly recurrance
	Given User is on "HomePage"
	Then User waits
	Then User wait and click on button "hometab"
	Given User is on "RandomScenariosPage"
	Then User click on the button "homecurrentdatelink"
	Then User click on the button "fouroclocklink"
	Then User click on the button "subjectcomboicon"
	Then User switches to newwindow 
	Then User waits
	
	Then User wait and click on button "otherslink"
	Then User switches to currentwindow
	
	Then User click on the button "endtimefielddropdown"
	Then User does mouseover on "endtimeover"
	Then User click on the button "endtimeover"
	Then User click on the button "recurrence"
	Then User click on the button "recurrenceenddatetextbox"
	Then User click on the button "recurrenceenddate"
	Then User click on the button "save"		
	Then User does mouseover on "monthviewmouseover"		
	Then User click on the button "monthviewmouseover"		
		Then User closes the browser	
			
			
	