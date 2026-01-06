package TestingAcadamyATB14x.ex04_Selenium_XPath;

import TestingAcadamyATB14x.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium20_MiniProject extends CommonToAll {

    @Owner("Sangeetha")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Login is working")
    @Test
    public void OHRM_Login() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://awesomeqa.com/hr/web/index.php/auth/login");
        Thread.sleep(3000);
        WebElement un = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
        Thread.sleep(3000);
        un.sendKeys("admin");
        Thread.sleep(3000);
        WebElement psw = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        Thread.sleep(3000);
        psw.sendKeys("Hacker@4321");
        Thread.sleep(3000);
        WebElement button = driver.findElement(By.xpath("//button"));
        button.click();

        WebElement h56 = driver.findElement(By.xpath("//span[@class=\"oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module\""));
        Assert.assertEquals(h56.getText(),"PIM");


        closeBrowser(driver);


    }


}
