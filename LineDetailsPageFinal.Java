package test.java.com.cricketwireless.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.java.com.cricketwireless.utilities.Log;
import test.java.com.cricketwireless.utilities.Xls_Reader;

public class LineDetailsPage {
    private static WebElement element = null;
    
		//Element Locator for the Your Line Details Tab
    		public static WebElement line_details_tab(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 2);
        element = driver.findElement(By.xpath(line_details_tab));
        return element;
    }
        
		//Element Locator for Line One Listed under Your Lines section
        public static WebElement lineOne(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 3);
        element = driver.findElement(By.xpath(lineOne));
        return element;
    }
		//Element Locator for Line Two Listed under Your Lines section
        public static WebElement lineTwo(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 4);
        element = driver.findElement(By.xpath(lineTwo));
        return element;
    }
		//Element Locator for Your Lines Expand Section
        public static WebElement lnExpdSectn(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 5);
        element = driver.findElement(By.xpath(lnExpdSectn));
        return element;
    }
		//Element Locator for
        public static WebElement phnLineHeader(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 6);
        element = driver.findElement(By.xpath(phnLineHeader));
        return element;
    }
		//Element Locator for
            public static WebElement lineUsageHeader(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 7);
        element = driver.findElement(By.xpath(lineUsageHeader));
        return element;
    }
		//Element Locator for
            public static WebElement lnUsageExpdSectn(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 8);
        element = driver.findElement(By.xpath(lnUsageExpdSectn));
        return element;
    }
				//Element Locator for the See Usage link
seeUsgDetlsLnk           public static WebElement lineUsageHeader(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 9);
        element = driver.findElement(By.xpath(seeUsgDetlsLnk));
        return element;
    }
		//Element Locator for the Plan Header
            public static WebElement planHeader(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 10);
        element = driver.findElement(By.xpath(planHeader));
        return element;
    }
				//Element Locator for the Plan expand section
            public static WebElement planExpdSectn(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 11);
        element = driver.findElement(By.xpath(planExpdSectn));
        return element;
    }
		//Element Locator for Change Plan button
            public static WebElement chgPlanBtn(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 12);
        element = driver.findElement(By.xpath(chgPlanBtn));
        return element;
    }
				//Element Locator for the Features header
            public static WebElement featureHeader(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 13);
        element = driver.findElement(By.xpath(featureHeader));
        return element;
    }
		//Element Locator for the Features expand button
            public static WebElement featureExpdSectn(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 14);
        element = driver.findElement(By.xpath(featureExpdSectn));
        return element;
    }
				//Element Locator for the add feature button
            public static WebElement addFeatBtn(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 15);
        element = driver.findElement(By.xpath(addFeatBtn));
        return element;
    }
		//Element Locator for the Device Header
            public static WebElement deviceHeader(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 16);
        element = driver.findElement(By.xpath(deviceHeader));
        return element;
    }
				//Element Locator for Device expand section
            public static WebElement deviceExpdSectn(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 17);
        element = driver.findElement(By.xpath(deviceExpdSectn));
        return element;
    }
		//Element Locator for the get new sim button
            public static WebElement getNewSimBtn(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 18);
        element = driver.findElement(By.xpath(getNewSimBtn));
        return element;
    }
				//Element Locator for Upgrade Device Button
            public static WebElement upgdDevBtn(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 19);
        element = driver.findElement(By.xpath(upgdDevBtn));
        return element;
    }
		//Element Locator for the Cricket Rewards Header
            public static WebElement crktRwdsHeader(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 20);
        element = driver.findElement(By.xpath(crktRwdsHeader));
        return element;
						//Element Locator for the Cricket Rewards Expand section
            public static WebElement crktRwdsExpdSectn(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 21);
        element = driver.findElement(By.xpath(crktRwdsExpdSectn));
        return element;
    }
		//Element Locator for the Join Now button under the Cricket rewards Section
            public static WebElement joinNowBtn(WebDriver driver) {
        Xls_Reader DataTable = new Xls_Reader("src", "", "test", "", "resources", "", "Test_Cases_Excel", "", "tc_0826_myaccount_multiline-line_details_view.xlsx");
        String protect_feature_add = DataTable.getCellData("Element_Locators_Data", "element_selector", 22);
        element = driver.findElement(By.xpath(joinNowBtn));
        return element;
    }
    }
		
		
		
		
	
