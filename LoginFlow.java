public Class LoginFlow {
    
    LoginPage page = new LoginPage();
    WebDriver driver = new WebDriver();
    WebDriverWait wait = new WebDriverWait(10);
    
   //Login as multiline user
   public static void multilineUser_Login() {
            //Go to Homepage
                driver.get("https://wwwsit1.cricketwireless.com/");
            // Click on Sign In button
                page.acctSignIn(driver).click();
            // Enter Username and Password
                page.username(driver).sendKeys(data.multilineUsernm);
                page.username(driver).sendKeys(data.multilinePwd);
            //Sign In 
                page.signInBtn.click();
    }
} 	 
	
   //Login as sigleline user
   public static void singlelineUser_Login() {
            //Go to Homepage
                driver.get("https://wwwsit1.cricketwireless.com/");
            // Click on Sign In button
                page.acctSignIn(driver).click();
            // Enter Username and Password
                page.username(driver).sendKeys(data.singlelineUsernm);
                page.username(driver).sendKeys(data.singlelinePwd);
            //Sign In 
                page.signInBtn.click();
    }
} 	
