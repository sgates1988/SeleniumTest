public Class HomePageFlows {

HomePage page = new HomePage();

WebDriver driver = new WebDriver();
WebDriverWait wait = new WebDriverWait(10);

    //Access the Account Summary Page from the Menu
    	public void getMyAcctSummaryTab() {
    
    		page.acctSummTab(driver).verifyElementIsPresent();
    		page.acctSummTab(driver).click();
    	} 
    
    //Access the Payments Page from the Menu
    	public void getPaymentsTab() {
    
    		page.paymentsTab(driver).verifyElementIsPresent();
    		page.paymentsTab(driver).click();
    	} 
    
    //Access the Billing History Page from the Menu
    	public void getBillHistTab () {
    
    		page.billHistTab(driver).verifyElementIsPresent();
    		page.billHistTab(driver).click();
    	} 
    
    //Access the Usage Page from the Menu
    	public void getUsageTab() {
    
    		page.usageTab (driver).verifyElementIsPresent();
    		page.usageTab(driver).click();
    		
	//Access the Line details Page from the Menu
	public void getLineDetailsTab() {

		page.lineDtlsTab(driver).verifyElementIsPresent();
		page.lineDtlsTab(driver).click();
	} 
}
