import static org.junit.Assert.assertTrue;
import org.openga.selenium.WebDriver;

public Class LineDtlsFlows {

	LoginPage page = new LoginPage();
	WebDriver driver = new WebDriver();
	WebDriverWait wait = new WebDriverWait(10, SECONDS);

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
    
    // Verify "Your Lines" header is present and expanded
    public static void verifyYourLineHeaderPresentAndExpanded() {
       String outcome = "true"; 
        
        driver.wait.until(ExpectedConditions.elementToBeClickable(lineUsageHeader));
        assertTrue("Verification Passed: Your Lines section is found.",(lineUsageHeader).equalsIgnoreCase(outcome)));
    
    // Verify "Your Lines" header is NOT present
        
    public static void verifyYourLineHeaderNotPresent() {
       String outcome = "false"; 
        
        driver.wait.until(ExpectedConditions.elementToBeClickable(lineUsageHeader));
        assertTrue("Verification Passed: Your Lines section is NOT found.",(lineUsageHeader).equalsIgnoreCase(outcome)));
         
    }       
    
//Verify Menu headers present Usage, Plan, Features, Device, and Cricket Rewards is present and expanded
    public static void verifyAllMenuHeadersPresentAndExpanded() {
       String outcome = "true"; 
        
        driver.wait.until(ExpectedConditions.elementToBeClickable(lnUsageExClpsBtn));
        assertTrue("Verification Passed: Usage section is expanded.",(lnUsageExpdSectn).equalsIgnoreCase(outcome)));
              
        driver.wait.until(ExpectedConditions.elementToBeClickable(lnUsageExClpsBtn));
        assertTrue("Verification Passed: Plan section is expanded.",(planExpdSectn).equalsIgnoreCase(outcome)));
        
        driver.wait.until(ExpectedConditions.elementToBeClickable(featureExpdSectn));
        assertTrue("Verification Passed: Feature section is expanded.",(lnUsageExpdSectn).equalsIgnoreCase(outcome)));
        
        driver.wait.until(ExpectedConditions.elementToBeClickable(deviceExpdSectn));
        assertTrue("Verification Passed: Device section is expanded.",(lnUsageExpdSectn).equalsIgnoreCase(outcome)));
        
        driver.wait.until(ExpectedConditions.elementToBeClickable(crktRwdsExpdSectn));
        assertTrue("Verification Passed: Rewards section is expanded.",(lnUsageExpdSectn).equalsIgnoreCase(outcome)));
    }
    
    
//Verify Menu headers present Usage, Plan, Features, Device, and Cricket Rewards is NOT present 
 public static void verifyAllMenuHeadersNotPresent() {
       String outcome = "false"; 
        
        driver.wait.until(ExpectedConditions.elementToBeClickable(lnUsageExClpsBtn));
        assertTrue("Verification Passed: Usage section is NOT expanded.",(lnUsageExpdSectn).equalsIgnoreCase(outcome)));
              
        driver.wait.until(ExpectedConditions.elementToBeClickable(lnUsageExClpsBtn));
        assertTrue("Verification Passed: Plan section is NOT expanded.",(planExpdSectn).equalsIgnoreCase(outcome)));
        
        driver.wait.until(ExpectedConditions.elementToBeClickable(featureExpdSectn));
        assertTrue("Verification Passed: Feature section is NOT expanded.",(lnUsageExpdSectn).equalsIgnoreCase(outcome)));
        
        driver.wait.until(ExpectedConditions.elementToBeClickable(deviceExpdSectn));
        assertTrue("Verification Passed: Device section is NOT expanded.",(lnUsageExpdSectn).equalsIgnoreCase(outcome)));
        
        driver.wait.until(ExpectedConditions.elementToBeClickable(crktRwdsExpdSectn));
        assertTrue("Verification Passed: Rewards section is NOT expanded.",(lnUsageExpdSectn).equalsIgnoreCase(outcome)));
    }
}
