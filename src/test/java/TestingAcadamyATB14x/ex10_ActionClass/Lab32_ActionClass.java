package TestingAcadamyATB14x.ex10_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab32_ActionClass {

    @Test
    public void test_actionclass(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement FN = driver.findElement(By.name("firstname"));
        // perform actions enter name in Cap letters
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT).sendKeys(FN,"sangeetha")
                .keyUp(Keys.SHIFT).build().perform();
    }
}
