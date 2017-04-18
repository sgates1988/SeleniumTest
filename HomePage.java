public Class HomePage extends Page {

    //Header Menu element locators
        static String acctSummTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[1]/a"));
        static String paymentsTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[2]"));
        static String billHistTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[3]/a"));
        static String usageTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[4]"));
        static String lineDtlsTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[5]/a"));
        static String acctSettTab = driver.findElement(By.xpath("//*[@id="myAccountMenuSub"]/li[6]"));

    //Add Funds Button
    static String addFundsBtn = driver.findElement(By.xpath("//*[@id="container"]/section/div/overview/div[2]/div[1]/div/div/myc-panel/div/div[2]/myc-panel-body/div[1]/div/div/div/div[2]/button"));

    //Billing
    static String monthTotl = driver.findElement(By.xpath("//*[@id="container"]/section/div/overview/div[2]/div[1]/div/div/myc-panel/div/div[2]/myc-panel-body/div[1]/div/div/div/div[1]/div[1]/div/div[2]/span"));
    static String acctCdt= driver.findElement(By.xpth("//*[@id="container"]/section/div/overview/div[2]/div[1]/div/div/myc-panel/div/div[2]/myc-panel-body/div[1]/div/div/div/div[1]/div[2]/div/div[2]/span”));
    static String amtDue= driver.findElement(By.cssSelector("input[ng-class="bill-due-line-item”]”));
    static String dueDate = driver.findElement(By.cssSelector("input[ng-class="bill-due-line-item”]”));

}
