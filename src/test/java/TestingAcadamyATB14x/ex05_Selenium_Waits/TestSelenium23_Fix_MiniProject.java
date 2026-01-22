package TestingAcadamyATB14x.ex05_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium23_Fix_MiniProject {

    //Locators - Find the WebElements
    // open the url app.vwo.com
    // Find the email id
    //Find the pass
    // find and click on the submit button
    //Verify that the error message is shown 'your email, password, ip address

    @Owner("Sangeetha")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Login is working")
    @Test

    public void test_VWlogin_Negative(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--start_maximized");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());

        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("admin@admin.com");

        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("password@321");

        WebElement submit = driver.findElement(By.id("js-login-btn"));
        submit.click();

      /*  try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }

       */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));

        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_msg.getText());

        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        driver.quit();
    }

}
