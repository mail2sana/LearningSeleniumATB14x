package TestingAcadamyATB14x.Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Ex_02_Mouse_Over_Actions {

    public static void main(String[] args) {
        // launch chrome driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.spicejet.com/");

        //Action class
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//div[text()=\"Travel Policies\"]"))).build().perform();
        act.click(driver.findElement(By.xpath("//div[text()='Passenger Rights']"))).build().perform();
        act.contextClick(driver.findElement(By.linkText("Airports"))).build().perform();

        driver.close();

    }
}
