package TestingAcadamyATB14x.ex03_Selenium_LOCATORS;

import TestingAcadamyATB14x.CommonToAll;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium019_MiniProj extends CommonToAll {

    @Description("Verify that the error message comes with invalid email on signup page")
    @Owner("Sangeetha")
    @Test
    public void freeTrial() {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com/#/login");

        WebElement partial_match = driver.findElement(By.partialLinkText("trial"));
        partial_match.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("abc");

        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        // Tagname
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        // error msg verify - <div
        // class="C(--color-red)
        // Fz(--font-size-12)
        // Trsp(--Op) Trsdu(0.15s)
        // Op(0) invalid-input+Op(1)
        // invalid-reason">
        // The email address you entered is incorrect.
        // </div>

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText()," The email address you entered is incorrect.");


    }
}
