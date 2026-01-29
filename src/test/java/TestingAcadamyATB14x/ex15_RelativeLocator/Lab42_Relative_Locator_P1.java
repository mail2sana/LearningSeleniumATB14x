package TestingAcadamyATB14x.ex15_RelativeLocator;

import TestingAcadamyATB14x.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static  org.openqa.selenium.support.locators.RelativeLocator.*;
import static org.openqa.selenium.By.id;


public class Lab42_Relative_Locator_P1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();


        WebElement span_element = driver.findElement(By.xpath("//span[contains(text(), 'Years of Experience')]"));
        driver.findElement((with(id("exp-2")).toRightOf(span_element))).click();

    }
}
