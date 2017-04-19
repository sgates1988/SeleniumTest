public Class LineDetailsPage {
        
        //Element locators for the multiline and single lines
        static String lineDtlsTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[5]/a"));
        static String lineOne = driver.findElement(By.xpath("//*[@id="multiline-region"]/div/div[1]/div/div/div/div"));
        static String lineTwo = driver.findElement(By.xpath("//*[@id="multiline-region"]/div/div[2]/div/div/div/div/div[2]/div[1]/p/strong"));
        
        //Element locators for the Your Lines Section 
        static String lnExpdSectn = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[5]/a"));
        static String phnLineHeader = driver.findElement(By.xpath("*[@id="container"]/section/div/line-details/div/page-banner/div/div/div/div/div[1]/h1")).getText();

        
        //Element locators for the Usage Section
        static String lineUsageHeader = driver.findElement(By.xpath("//*[@id="container"]/section/div/line-details/section/div/div/div/line-details-usage/section/div/div/div[1]/div[1]/h2"));
        static String lnUsageExpdSectn = driver.findElement(By.xpath("//*[@id="usage-region"].getAttribute("aria-expanded")"));
        static String seeUsgDetlsLnk = driver.findelement(By.xpath("//*[@id="usage-region"]/div/div[2]/div/div/div[2]/span/a"));
        
        //Element locators for the Plan Section
        static String planHeader = driver.findElement(By.xpath("//*[@id="container"]/section/div/line-details/section/div/div/div/line-details-plan/section/div/div[1]/div/div[1]/h2"));
        static String planExpdSectn = driver.findElement(By.xpath("//*[@id="plan-region"].getAttribute("aria-expanded")));
        static String chgPlanBtn = driver.findElement(By.xpath("//*[@id="plan-region"]/div/div[2]/div/div/div[3]/div/button"));
                                                                  
        //Element locators for the Features Section
        static String featureHeader = driver.findElement(By.xpath("//*[@id="container"]/section/div/line-details/section/div/div/div/line-details-features/section/div/div/div[1]/div[1]/h2"));
        static String featureExpdSectn = driver.findElement(By.xpath("//*[@id="features-region"].getAttribute("aria-expanded")"));
        static String addFeatBtn = driver.findElement(By.xpath("//*[@id="features-region"]/div/div/div/div/div[2]/div/div/button"));
                                                                  
        //Element locators for the Device Section
        static String deviceHeader = driver.findElement(By.xpath("//*[@id="container"]/section/div/line-details/section/div/div/div/line-details-device/section/div/div/div[1]"));
        static String deviceExpdSectn = driver.findElement(By.xpath("//*[@id="device-region"].getAttribute("aria-expanded")"));
        static String getNewSimBtn = driver.findElement(By.xpath("//*[@id="device-region"]/div/div/div/div[2]/div[2]/div/div/div[2]/button"));
        static String upgdDevBtn = driver.findElement(By.xpath("//*[@id="device-region"]/div/div/div/div[2]/div[2]/div/div/div[3]/button"));
        
        //Element locators for the Rewards Section
       static String crktRwdsHeader = driver.findElement(By.xpath("//*[@id="container"]/section/div/line-details/section/div/div/div/line-details-rewards/section/div/div/div[1]/div[1]/h2"));
       static String crktRwdsExpdSectn = driver.findElement(By.xpath("//*[@id="rewards-region"].getAttribute("aria-expanded")"));
       static String joinNowBtn = driver.findElement(By.xpath("//*[@id="rewards-region"]/div/div/div/div[2]/div[1]/div[2]/button"));
        
               
    }
