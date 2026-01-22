package TestingAcadamyATB14x.ex05_Selenium_Waits;

import TestingAcadamyATB14x.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

public class TestSelenium25_FluentWait extends CommonToAll {

    @Test
    public void test_FW() {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://app.vwo.com");
        System.out.println(driver.getTitle());

        Assert.assertEquals(driver.getTitle(), "Login-VWO");
        Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");

        //Find the email input box and enter the email
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
        // Explixit Wait
        /*
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg")));

        WebElement error_msg = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_msg.getText());

         */

        //Fluent Wait
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement error_msg = wait.until(
                new Function<WebDriver, WebElement>() {
                    @Override
                    public WebElement apply(WebDriver webDriver) {
                        return driver.findElement(By.className("notification-box-description"));
                    }
        }
);
    }
    }

