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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21_MiniProject_3 extends CommonToAll {

    @Owner("Sangeetha")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Login is working")
    @Test
    public void ketalon_Login() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://katalon-demo-cura.herokuapp.com");

       WebElement appoint = driver.findElement(By.xpath("//a [contains(text(),'Make')]"));
       appoint.click();

       List <WebElement> username=driver.findElements(By.xpath("//input[@placeholder='Username']"));
       username.get(1).sendKeys("John Doe");

       List<WebElement> pass = driver.findElements(By.xpath("//input[@placeholder='Password']"));
       pass.get(1).sendKeys("ThisIsNotAPassword");

       WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
       login.click();

       customWait(3000);

      WebElement h2= driver.findElement(By.xpath("//h2[text()='Make Appointment']"));

        Assert.assertEquals(h2.getText(),"Make Appoinment");
        Assert.assertTrue(h2.isDisplayed());



    }

}
