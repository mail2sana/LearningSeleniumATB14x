package TestingAcadamyATB14x.ex10_ActionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab35_Interv_PageUpDown {
    @Test
    public void test_pageUpDown(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.DOWN).sendKeys(Keys.PAGE_DOWN).build().perform();

    }
}
