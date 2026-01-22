package TestingAcadamyATB14x.ex06_Selenium_Input_Alerts_DropDwn_Radio_Check;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Selenium_28_Alerts {

    @Test
    public  void test_Alerts(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

      //  WebElement element_ALert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
      //  WebElement element_Confirm = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
          WebElement element_prompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

      //  element_ALert.click();
       // element_Confirm.click();
        element_prompt.click();

        //Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        // for prompt need  to use send key bcoz have to enter msg
        alert.sendKeys("sana");
       alert.accept();
     //   alert.dismiss();

        String result = driver.findElement(By.id("result")).getText();
       // Assert.assertEquals(result,"You successfully clicked an alert");
      //  Assert.assertEquals(result,"You clicked: Ok");
        Assert.assertEquals(result,"You entered: sana");


    }
}
