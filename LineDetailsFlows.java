public Class LineDtlsFlows {

LoginPage page = new LoginPage();

WebDriver driver = new WebDriver();
WebDriverWait wait = new WebDriverWait(10);

//Checks for Multiline Users
public static  void verifyMultiLineUsersPresent(String value) {
    driver.wait.until(ExpectedConditions.elementToBeClickable(lineOne)));

String lineOneTest = lineOne.getText();
    if (assertTrue(lineOneTest.contains(multilineUsernm))) {;
            System.out.println("Line One User is Valid");
        } else {
            System.out.println("User is invalid for Line One")
        }
        String lineTwoTest = lineTwo.getText();
    if (multilineUsernmTwo = lineTwoTest) {
        Console.WriteLine("Line Two User is Valid");
        } else {
            System.out.println("User is invalid for Line Two")
        }
    }
    
//Check for Single line user
public static  void verifySingleLineUserPresent() {
    driver.wait.until(ExpectedConditions.elementToBeClickable(lineOne));
    String lineOneTest = lineOne.getText();
    if (singlelineUsernm = lineOneTest) {
        System.out.println("Line One User is Valid");
        } else {
            System.out.println("User is invalid for Line One")
        }
    }
}
    // Verify "Your Lines" header is present and expanded
    public static void verifyYourLineHeaderIsPresentAndExpanded() {
        driver.wait.until(ExpectedConditions.elementToBeClickable(lnUsageExClpsBtn));
        if (lnUsageExClpsBtn = 'true') {
            System.out.println("Usage section is expanded");
            } else {
                System.out.println("Usage section is no expanded")
            }
             driver.wait.until(ExpectedConditions.elementToBeClickable(lnUsageExClpsBtn));
        if (planExClpsBtn = 'true') {
            System.out.println("Plan section is expanded");
            } else {
                System.out.println("Plan section is no expanded")
            }
             driver.wait.until(ExpectedConditions.elementToBeClickable(lnUsageExClpsBtn));
        if (featureExClpsBtn = 'true') {
            System.out.println("Features section is expanded");
            } else {
                System.out.println("Features section is no expanded")
            }
             driver.wait.until(ExpectedConditions.elementToBeClickable(lnUsageExClpsBtn));
        if (deviceExClpsBtn = 'true') {
            System.out.println("Device section is expanded");
            } else {
                System.out.println("Device section is no expanded")
            }
             driver.wait.until(ExpectedConditions.elementToBeClickable(lnUsageExClpsBtn));
        if (crktRwdsExClpsBtn = 'true') {
            System.out.println("Cricket Rewards section is expanded");
            } else {
                System.out.println("Cricket Rewards section is no expanded")
            }
    }
    // Verify "Your Lines" header is NOT present
    public static void verifyYourLineHeaderIsNotPresent() {
       
    }    
    
}

//Verify Menu headers present Usage, Plan, Features, Device, and Cricket Rewards is present and expanded

    public static void verifyAllMenuHeadersIsPresentAndExpanded() {
       
    }
    
//Verify Menu headers present Usage, Plan, Features, Device, and Cricket Rewards is NOT present 
 public static void verifyAllMenuHeadersIsNotPresent() {
       
    }
}
