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

public class Selenium_MiniProject2 extends CommonToAll {

    @Description("Verify the Start a trial , error msg is displayed")
    @Owner("Sangeetha")
    @Test

    public void Start_Trial(){
        //Step 1: Open browser, pass url
        WebDriver driver = new ChromeDriver();
        openBrowser(driver,"https://app.vwo.com/#/login");

        //Step2: Click 'start trial'
        //<a
        // href="https://vwo.com/free-trial/?utm_medium=website&amp;
        // utm_source=login-page&amp;
        // utm_campaign=mof_eg_loginpage"
        // class="text-link Td(n) Whs(nw)"
        // data-qa="bericafeqo"
        // vwo-html-translate="login:startFreeTrial">
        // Start a free trial
        // </a>

        WebElement start_trial=driver.findElement(By.linkText("Start a free trial"));
        start_trial.click();

        //Step3: add an invalid email and verify,
        //<input
        // class="W(100%) Py(14px) input-text"
        // placeholder="name@yourcompany.com"
        // type="email"
        // id="page-v1-step1-email"
        // name="email"
        // data-qa="page-su-step1-v1-email"
        // required="">

        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("admin@hgjty.com");

        //Step4:
        //<input class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
        // type="checkbox"
        // name="gdpr_consent_checkbox"
        // id="page-free-trial-step1-cu-gdpr-consent-checkbox"
        // value="true" data-qa="page-free-trial-step1-gdpr-consent-checkbox"
        // data-gtm-form-interact-field-id="0">

        WebElement agree = driver.findElement(By.name("gdpr_consent_checkbox"));
        agree.click();

        //Step5:
        //Step4 - Wait some time

        customWait(5000);

        //Step6:submit 'create a trial'
        //<button
        // type="submit"
        // class="button W(100%) btn-modal-form-submit"
        // data-qa="page-su-submit">Create a Free Trial Account
        // </button>

        WebElement create = driver.findElement(By.className("button"));
        create.click();

       // Assert.assertEquals(create.getText(),"The email address you entered is incorrect");

        closeBrowser(driver);

    }
}
