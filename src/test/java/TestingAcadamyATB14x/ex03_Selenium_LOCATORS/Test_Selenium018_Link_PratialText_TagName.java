package TestingAcadamyATB14x.ex03_Selenium_LOCATORS;

import TestingAcadamyATB14x.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Selenium018_Link_PratialText_TagName extends CommonToAll {

    @Description("Create account negative TC")
    @Owner("Sangeetha")
    @Test
    public void test_trial(){

        WebDriver driver=new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com/#/login");

        //LinkText - Full text match , links are only created for the <a> tag
        //PartialText - Partial Match
/*
        WebElement fullmatch = driver.findElement(By.linkText("Start a free trial"));
      //WebElement fullmatch = driver.findElement(By.linkText("Start a free tria")); l missed means not work not exact match also not work. Will work only full match
        fullmatch.click();

 */

        //but find by partial match with PartialLinkText

        WebElement partial = driver.findElement(By.partialLinkText("trial"));
        //Start a free tria , Start a free , Start a, Start, free,a, Star...
        partial.click();








        closeBrowser(driver);

    }
}
