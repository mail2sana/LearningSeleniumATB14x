package TestingAcadamyATB14x.Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex_03_Mouse_Actions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        Actions actions = new Actions(driver);

        // Right Click
        WebElement rightClickBtn = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClickBtn).perform();

        // Double Click
        WebElement doubleClickBtn = driver.findElement(By.id("doubleClickBtn"));
        actions.doubleClick(doubleClickBtn).perform();

        // Mouse Hover
        driver.get("https://demoqa.com/menu");
        WebElement menu = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
        actions.moveToElement(menu).perform();

      //  driver.quit();
    }
}

