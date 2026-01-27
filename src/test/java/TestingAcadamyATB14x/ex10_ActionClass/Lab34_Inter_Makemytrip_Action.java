package TestingAcadamyATB14x.ex10_ActionClass;

import TestingAcadamyATB14x.CommonToAll;
import TestingAcadamyATB14x.ex07_WaitHelpers.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Lab34_Inter_Makemytrip_Action extends CommonToAll {

    @Test
    public void test_ActionClass() {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://www.makemytrip.com/");
        driver.manage().window().maximize();

        //Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        // this will close the modal
        WebElement modal = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        modal.click();

        // wait for pop close
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='minimize']")));

        WebElement ai_modal = driver.findElement(By.xpath("//img[@alt='minimize']"));
        ai_modal.click();

        WebElement backgrnd_element = driver.findElement(By.tagName("body"));
        backgrnd_element.click();

        // wait
        new WaitHelpers().waitJVM(3000);

        WebElement fromCity = driver.findElement(By.xpath("//input[@id='fromCity']"));
        WebElement toCity = driver.findElement(By.xpath("//input[@id='toCity']"));
        Actions actions = new Actions(driver);

        actions.moveToElement(fromCity).click().build().perform();
        // wait
        new WaitHelpers().waitJVM(2000);

        actions.moveToElement(fromCity).sendKeys("MAA").build().perform();
        // wait
        new WaitHelpers().waitJVM(1000);
     //   actions.moveToElement(fromCity).click().keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();

        actions.moveToElement(toCity).click().build().perform();
        // wait
        new WaitHelpers().waitJVM(2000);

        actions.moveToElement(toCity).sendKeys("BLR").build().perform();
        // wait
        new WaitHelpers().waitJVM(1000);
        actions.moveToElement(fromCity).click().keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build().perform();

        //select city from the dropdown list
        try {
            List<WebElement> list_auto = driver.findElements(By.xpath("//ul[@class='userSection pushRight']/li"));
            for (WebElement e : list_auto) {
                if (e.getText().contains("Chennai")) {
                    e.click();
                }
            }
            } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            List<WebElement> list_auto = driver.findElements(By.xpath("//ul[@class='userSection pushRight']/li"));
            for (WebElement e : list_auto) {
                if (e.getText().contains("Banglore")) {
                    e.click();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        


       // closeBrowser(driver);

    }
}
