public Class LineDetailsPage {
        
        //Element locators for the multiline and single lines
        static String lineDtlsTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[5]/a"));
        static String lineOne = driver.findElement(By.xpath("//*[@id="multiline-region"]/div/div[1]/div/div/div/div"));
        static String lineTwo = driver.findElement(By.xpath("//*[@id="multiline-region"]/div/div[2]/div/div/div/div/div[2]/div[1]/p/strong"));
        
        //Element locators for the Section Headers
        static String lineUsageHeader = driver.findElement(By.xpath("//*[@id="container"]/section/div/line-details/section/div/div/div/line-details-usage/section/div/div/div[1]/div[1]/h2"));
        static String planHeader = driver.findElement(By.xpath("//*[@id="container"]/section/div/line-details/section/div/div/div/line-details-plan/section/div/div[1]/div/div[1]/h2"));
        static String featureHeader = driver.findElement(By.xpath("//*[@id="container"]/section/div/line-details/section/div/div/div/line-details-features/section/div/div/div[1]/div[1]/h2"));
        static String deviceHeader = driver.findElement(By.xpath("//*[@id="container"]/section/div/line-details/section/div/div/div/line-details-device/section/div/div/div[1]"));
        static String crktRwdsHeader = driver.findElement(By.xpath("//*[@id="container"]/section/div/line-details/section/div/div/div/line-details-rewards/section/div/div/div[1]/div[1]/h2"));
       
       //Element locators for the expanded sections
        static String lnExpdSectn = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[5]/a"));
        static String lnUsageExpdSectn = driver.findElement(By.xpath("//*[@id="usage-region"].getAttribute("aria-expanded")"));
        static String planExpdSectn = driver.findElement(By.xpath("//*[@id="plan-region"].getAttribute("aria-expanded")));
        static String featureExpdSectn = driver.findElement(By.xpath("//*[@id="features-region"].getAttribute("aria-expanded")"));
        static String deviceExpdSectn = driver.findElement(By.xpath("//*[@id="device-region"].getAttribute("aria-expanded")"));
        static String crktRwdsExpdSectn = driver.findElement(By.xpath("//*[@id="rewards-region"].getAttribute("aria-expanded")"));
        
    }
