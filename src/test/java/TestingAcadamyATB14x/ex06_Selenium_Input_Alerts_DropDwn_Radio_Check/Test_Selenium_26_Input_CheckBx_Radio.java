package TestingAcadamyATB14x.ex06_Selenium_Input_Alerts_DropDwn_Radio_Check;

import TestingAcadamyATB14x.CommonToAll;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Selenium_26_Input_CheckBx_Radio extends CommonToAll {

    @Test
    public  void test_HTMLTags(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Input Box
        WebElement FN = driver.findElement(By.name("firstname"));
        FN.sendKeys("Sangeetha");

        //Radio Box

        WebElement Radio = driver.findElement(By.id("sex-0"));
        Radio.click();

        //CheckBox
        driver.findElement(By.id("profession-1")).click();

        closeBrowser(driver);

    }


}
