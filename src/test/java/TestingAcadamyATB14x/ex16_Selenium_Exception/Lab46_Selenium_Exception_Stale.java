package TestingAcadamyATB14x.ex16_Selenium_Exception;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab46_Selenium_Exception_Stale {

    @Test
    public void test_stale(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println("Start of the program");

        WebElement search_box = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

        driver.navigate().refresh(); // stale exceptions

        try {
            search_box.sendKeys("TheTestingAcademy"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException");;
        }
    }
}
