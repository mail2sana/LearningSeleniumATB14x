package TestingAcadamyATB14x.ex10_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Lab33_Interview_Action {

    @Test
    public void test_Inter(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();

        // //div[text()='From']/following-sibling::div
        WebElement source_from = driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        WebElement destination = driver.findElement(By.cssSelector("div[data-testid='to-testID-destination'] input[type=text]"));

        Actions actions = new Actions(driver);
      //  actions.moveToElement(source_from).click().sendKeys("blr").build().perform();
        actions.moveToElement(source_from).click().sendKeys("BLR")
                .moveToElement(destination).sendKeys("DEL").build().perform();

      //  WebElement destination = driver.findElement(By.cssSelector("div[data-testid='to-testID-destination'] input[type=text]"));

      //  Actions actions1 = new Actions(driver);
      //  actions1.moveToElement(destination).click().sendKeys("DEL").build().perform();



    }
}
