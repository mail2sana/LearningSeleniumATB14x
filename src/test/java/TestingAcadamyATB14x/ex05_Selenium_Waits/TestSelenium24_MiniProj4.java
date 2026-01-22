package TestingAcadamyATB14x.ex05_Selenium_Waits;

import TestingAcadamyATB14x.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium24_MiniProj4 extends CommonToAll {

    @Description("Verify makemytrip open with modal")
    @Test
    public void testcloseModal(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

        waitforVisiblity(driver,5,"//span[@data-cy=\"closeModal\"]");
// when use popups, modal use proper waiting mechanism
        WebElement closepopup = driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]"));
        closepopup.click();


    }
}
