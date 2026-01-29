package TestingAcadamyATB14x.ex15_RelativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Lab43_RelativeLocator_P2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();

        driver.switchTo().frame("result");

        driver.findElement(By.xpath("//form[@id='form']/button")).click();

        WebElement User_N = driver.findElement(By.id("username"));

        WebElement error_msg = driver.findElement(with(By.tagName("small")).below(User_N));
        String errorText = error_msg.getText();
        Assert.assertEquals(errorText,"Username must be at least 3 characters");




    }
}
