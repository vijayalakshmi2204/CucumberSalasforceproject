	Feature: Opportunities tab features in  Salesforce Application

  Background: Launch into the application
    Given User Launch the browser
    Given User is on "LoginPage" 
    Then User enter into the textbox "Username" "vijitest@ad.com"
    Then User enter into the textbox "password" "password@890"
    Then User click on the button "Login"
    Then verify login with valid credentials
    
   
  Scenario:TC16 User views opportunies tab dropdown
  Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "OpportunitiesTab"
	Given User is on "OpportunitiesPage"
	Then User click on the button "Opportunitiesdropdown"
	Then User closes the browser
	
	
	Scenario:T17 User Creates NewOpportunity
	Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "OpportunitiesTab"
	Given User is on "OpportunitiesPage"
	Then User click on the button "newbutton"
	Then User enter into the textbox "oppname" "opportunity test1"
	Then User click on the button "accountname"
	Then User switches to newwindow 
#	Then User switchtoframe "accountsearchiframe"
#	Then User enter into the textbox "typeaccount" "Dakshin "
#	Then User click on the button "gobtn"
Then User switches to currentwindow
#	Then User waits
#	Then User switchTo defaultpage


	Then User switchtoframe "accountresultiframe"
	Then User click on the button "accountselect"
	Then User switches to currentwindow
	Then User waits
	Then User click on the button "oppclosedate"
	Then User click on the button "date"
	Then User selects the dropdown "stagedropdown"  "Qualification"
	Then User enter into the textbox "Probability" "10"
	Then User click on the button "Primarycampaignwindow"
	Then User switches to newwindow 	
	Then User switchtoframe "campaigniframe"
	Then User click on the button "selectcampaign"
	Then User switches to currentwindow
	Then User waits
	Then User waits
	Then User click on the button "oppsave"
	Then User closes the browser
	
		
	Scenario:T18 TestOpportunityPipelineReport
	Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "OpportunitiesTab"
	Given User is on "OpportunitiesPage"
	Then User waits
	Then User wait and click on button "opppipeline"
	Then User closes the browser	
	

	Scenario:T19 TestStuckOpportunitiesReport
	Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "OpportunitiesTab"
	Given User is on "OpportunitiesPage"
	Then User waits
	Then User wait and click on button "stuckopp"
	Then User closes the browser
	
	@Run
	Scenario:T20 TestQuarterlySummaryReport
	Given User is on "HomePage" 
	Then User waits
	Then User wait and click on button "OpportunitiesTab"
	Given User is on "OpportunitiesPage"
	Then User waits
	Then User selects the dropdown "Intervaldropdown"  "Current and Next FY"
	Then User selects the dropdown "Includedropdown"  "All Opportunities"
	Then User wait and click on button "runreport"
	Then User closes the browser
	
	
	
	

		
		
		



		

		
		
	
	
	
	