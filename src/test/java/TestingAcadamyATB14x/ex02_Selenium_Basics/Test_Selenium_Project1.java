package TestingAcadamyATB14x.ex02_Selenium_Basics;

import TestingAcadamyATB14x.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium_Project1 extends CommonToAll {

    @Description("TC#1 Verify that particular text exists on the Katalon Websit")
    @Link("https://bugz.atlassian.net/browse/VP-1") // just show you in the allure report
    @Test

    public void test_verify_text(){
        WebDriver driver = new FirefoxDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com");
        if(driver.getPageSource().contains("CURA Healthcare Service")){
            System.out.println("Test case Passed");
            Assert.assertTrue(true);
        }
        else {
            System.out.println("Test case Failed");
            Assert.assertTrue(false);
        }
        closeBrowser(driver);
    }

}