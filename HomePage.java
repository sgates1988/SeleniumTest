public Class HomePage extends Page {

    //Header Menu element locators
        static String acctSummTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[1]/a"));
        static String paymentsTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[2]"));
        static String billHistTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[3]/a"));
        static String usageTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[4]""));
        static String lineDtlsTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[5]/a"));
        static String acctSettTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[6]"));
}
