package TestingAcadamyATB14x.ex03_Selenium_LOCATORS;

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

public class Test_Selenium_017_Proj_Locators extends CommonToAll {
    @Description("Verify the invalid login details, error msg is displayed")
    @Owner("Sangeetha")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void test_InvaidLogin(){
        // Step 1 - Find the email and enter the id
        //Step2 - Find the Password & enter it
        //Step3 - Find the submit and click
        //Step4 - Wait some time
        //Step5 - verify the error msg

        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com/#/login");

        // Step 1 - Find the email and enter the id
      //  key value pair , these are attributes of selenium (id,name,class,tag, type)
        //<input
        // type="email"
        // class="text-input W(100%)"
        // name="username"
        // vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterEmailID"
        // id="login-username"
        // data-qa="hocewoqisi"
        // placeholder="Enter email ID"
        // >

      // WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
       // driver.get("https://app.vwo.com/#/login"); instead of this we can extens the common all functions

        //element find by using which one , sigle element - use findElement(), multiple - use findElements();
        WebElement email = driver.findElement(By.id("login-username"));

        // sendKeys use to enter the username in text field
        email.sendKeys("admin@admin.com");

        //Step2 - Find the Password & enter it
        //<input
        // type="password"
        // class="text-input W(100%)" vwo-html-translate-attr="placeholder"
        // vwo-html-translate-placeholder="login:enterPassword"
        // name="password"
        // id="login-password"
        // data-qa="jobodapuxe"
        // placeholder="Enter password"
        // >
        //no id , name use
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("123456789");

       // Step3 - Find the submit and click
        //<button
        // type="submit"
        // id="js-login-btn"
        // class="btn btn--primary btn--inverted W(100%) Mb(8px) Mb(0):lc"
        // onclick="login.login(event)"
        // data-qa="sibequkica">
        // <span class="icon loader hidden" data-qa="zuyezasugu"></span>
        // <span data-qa="ezazsuguuy" vwo-html-translate="login:signIn">
        // Sign in</span>
        // </button>

        // id , name - not there , can use class - no why width is 80%

        WebElement submit = driver.findElement(By.id("js-login-btn"));
        submit.click();

        //Step4 - Wait some time

        customWait(5000);

        //Step5 - verify the error msg
        //<div
        // class="notification-box-description"
        // id="js-notification-box-msg"
        // data-qa="rixawilomi">Your email, password,
        // IP address or location did not match
        // </div>
        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_msg.getText());

        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        closeBrowser(driver);
    }
}
