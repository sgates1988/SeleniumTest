public Class LoginPage extends Page {
        
        //Account Sign In or Create Account element locators
        
        static String acctSignIn = driver.findElemnt(By.id("linkAmssLogin"));
        static String usernameFld = driver.findElement(By.id("username"));
        static String passwordFld = driver.findElement(By.id("password"));
        static String signInBtn = driver.findElement(By.xpath("//*[@id="container"]/section/div/login/div[1]/div/section[1]/div/div[2]/div[2]/login-form/form/div[4]/div/button/span[1]"));
}
