package TestingAcadamyATB14x.ex16_Selenium_Exception;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Lab47_Selenium_StaleException_Waiting {

    @Test
    public void test_stale_exception(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("Start of the program");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='APjFqb']")));

        driver.navigate().refresh(); // stale exceptions

        WebElement search_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        search_box.sendKeys("TheTestingAcademy");
    }
}
