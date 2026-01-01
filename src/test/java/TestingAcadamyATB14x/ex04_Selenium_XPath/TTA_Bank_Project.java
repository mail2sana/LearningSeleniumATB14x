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
import org.testng.annotations.Test;

public class TTA_Bank_Project extends CommonToAll {

    @Owner("Sangeetha")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Login is working")
    @Test
    public void TTA_Bank() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        openBrowser(driver,"https://tta-bank-digital-973242068062.us-west1.run.app/");
        Thread.sleep(3000);
//Signup
        //<button class="font-medium text-blue-600 hover:text-blue-500 focus:outline-none">
        // Sign Up
        // </button>

        WebElement signup = driver.findElement(By.xpath("//button[text()='Sign Up']"));
        signup.click();

        Thread.sleep(3000);

        WebElement Name = driver.findElement(By.xpath("//input[@type='text']"));
        Name.sendKeys("Sanjana");
        Thread.sleep(3000);


        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("sanjana@tta.com");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("abc123456");

        WebElement create_Ac = driver.findElement(By.xpath("//button[@type='submit']"));
        create_Ac.click();



        // Sign in

        openBrowser(driver,"https://tta-bank-digital-973242068062.us-west1.run.app/");
        Thread.sleep(3000);

        WebElement eml = driver.findElement(By.xpath("//input[@type='email']"));
        eml.sendKeys("sanjana@tta.com");

        WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
        pwd.sendKeys("abc123456");

        WebElement remember = driver.findElement(By.id("remember-me"));
        remember.click();

        WebElement sign_in = driver.findElement(By.xpath("//button[@type='submit']"));
        sign_in.click();



        // Add Beneficiary



        closeBrowser(driver);



    }
}
