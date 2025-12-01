Feature: UserMenu dropdown in Salesforce Application

  Background: Launch into the application
    Given User Launch the browser
    Given User is on "LoginPage" 
    Then User enter into the textbox "Username" "vijitest@ad.com"
    Then User enter into the textbox "password" "password@890"
    Then User click on the button "Login"
    Then verify login with valid credentials
    
    
  Scenario:TC6 Select user menu for username drop down
  	
    Given User is on "HomePage"
    Then User wait and click on button "profile"
    Then User closes the browser
    

  Scenario:TC7 Select My Profile option from user menu for username drop down 
   	
    Given User is on "HomePage"
    Then User wait and click on button "profile"
    Then User click on the button "myprofile"
    Then User click on the button "editcontact"
    Then User switchtoframe "contactiframe"
    Then User wait and click on button "about"
    Then User wait and enter into the textbox "lastname" "Mohan"
    Then User wait and click on button "saveall"
    Then User switchTo defaultpage
    
    Then User click on the button "post"
    Then User switchtoframe "postiframe1"
    Then User wait and enter into the textbox "posttextbox" "Selenium Training Session"
    Then User switchTo defaultpage
    Then User click on the button "share"
    
    Then User wait and click on button "file"
    Then User wait and click on button "uploadfile"
    Then User click on and sends the file location "choosefile" "C:\\Users\\prakr\\Downloads\\test-plan-example.doc"
    Then User click on the button "sharefile"
    
    Then User does mouseover on "photohover"
    Then User click on the button "addphoto"
    Then User switchtoframe "browsephotoiframe"
    Then User click on and sends the file location "uploadInput" "C:\\Users\\prakr\\Downloads\\testing.png"
    Then User wait and click on button "savephoto"
    Then User waits
    Then User waits and crop the image "cropimage"
    Then User waits
		Then User waits
    Then User wait and click on button "finalsavephoto"
    Then User closes the browser
    
    Scenario:TC8 Select My settings option from user menu for username drop down
    
    Given User is on "HomePage"
    Then User wait and click on button "profile"
    Given User is on "MysettingsPage"
    Then User click on the button "mysettingsfromusermenu"
    Then User click on the button "personallink"
    Then User click on the button "loginhistory"
    Then User click on the button "csvfile"
    
    Then User click on the button "DisplayAndLayout"
    Then User click on the button "CustomizeTabs"
    Then User click on the button "CustomizeTabs"
    Then User selects the dropdown "CustomAppdropdown"  "Salesforce Chatter"
    Then User selects the dropdown "availabletabsdropdown"  "Reports"
    Then User click on the button "add"
    Then User click on the button "DisplayAndLayoutsave"
    
    Given User is on "HomePage"
   	Then User waits
   	 Then User wait and click on button "menubutton"
    Then User wait and click on button "salesmenu"
    Then User wait and click on button "menubutton"
    Then User wait and click on button "SalesforceChatter"
    Then User wait and click on button "menubutton"
    Then User wait and click on button "marketing"
   
     Given User is on "MysettingsPage"
     Then User wait and click on button "email"
     Then User wait and click on button "EmailSettings"
     Then User enter into the textbox "Emailname" "Vijayalakshmi Mohan"
     Then User enter into the textbox "Emailid" "viji27797@gmail.com"
     Then User wait and click on button "bccbutton"
     Then User wait and click on button "emailsave"
     
     Then User wait and click on button "calrem"
     Then User wait and click on button "activerem"
     Then User wait and click on button "opentestbutton"
     Then User closes the browser
     
     Scenario:TC9 User selects developer console from usermenu
     Given User is on "HomePage"
     Then User waits
     Then User wait and click on button "profile"
     Then User waits
     Then User wait and click on button "devconsole"
     Then User closes the browser
     
     Scenario:TC10 User selects developer console from usermenu
      Then User wait and click on button "profile"
      Then User waits
     Then User wait and click on button "logout"
     Then User closes the browser
     
    
     
     
     
		
		
    
    