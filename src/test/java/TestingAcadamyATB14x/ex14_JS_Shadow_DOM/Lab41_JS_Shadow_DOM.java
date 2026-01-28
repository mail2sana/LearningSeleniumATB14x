package TestingAcadamyATB14x.ex14_JS_Shadow_DOM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static TestingAcadamyATB14x.ex07_WaitHelpers.WaitHelpers.waitJVM;

public class Lab41_JS_Shadow_DOM {
    @Test
    public void test_ShDm(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
        driver.manage().window().maximize();

        waitJVM(3000);
        //unable find id -pizza why due to shadow dom, under shadow root
     //   driver.findElement(By.id("pizza")).sendKeys("farmHouse");

        // use java script executor has to use
        JavascriptExecutor js = (JavascriptExecutor) driver;

       WebElement pizza = (WebElement) js.executeScript("return document.querySelector('div#userName').shadowRoot.querySelector('div#app2').shadowRoot.querySelector('input#pizza');");
       pizza.sendKeys("farmHouse");

        // it is frame so need to do switch to indentify the id in frame
        driver.switchTo().frame("pact3");

        WebElement input_glaf = driver.findElement(By.id("glaf"));
        input_glaf.sendKeys("hi ");








    }

}
