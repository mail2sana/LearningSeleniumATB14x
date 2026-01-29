package TestingAcadamyATB14x.ex16_Selenium_Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab48_Selenium_TimeOutException {

    @Test
    public void test_stale_exception(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@class='gtyf']")));

        // Waiting for an element but that doesn't exist that time - Timeout exception is showing



    }
}
