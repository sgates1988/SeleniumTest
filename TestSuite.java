public Class TestSuite {

// Test case for multiline line details 
public Class tc_0826_myaccount_multiline_line_details_view() {
    
//Given: I am logged into a multiline accout
LoginFlows.singlelineUser_Login();


//When: I select line details from the menu

HomePageFlows.getLineDetailsTab();

//Then: I land on the line details view with "your lines" heading expanded 




}
// Test case for singleline line details 

public Class tc_0827_myaccount_singleline_line_details_view() {
    
//Given: I am logged into a singleline accout


//When: I select line details from the menu


//Then: I land on the line details view for that line

//And:the "your lines" heading is not present in the view

//And: the usage, plan, features, device and cricket rewards headings are available and all expanded 
	}	 
	
}
