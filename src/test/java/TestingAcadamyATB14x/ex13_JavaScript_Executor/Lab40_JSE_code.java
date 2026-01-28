package TestingAcadamyATB14x.ex13_JavaScript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab40_JSE_code {
    @Test

    public  void test_JS(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://thetestingacademy.com/");
        driver.manage().window().maximize();

        //Java script executor code execution
        JavascriptExecutor js = (JavascriptExecutor) driver;
     //   js.executeScript("alert(1)");

        js.executeScript("window.location = 'https://www.google.com/'");
        driver.get("https://selectorshub.com/xpath-practice-page/");

        // scroll down can do
        js.executeScript("window.scrollBy(0,10000)");
        js.executeScript("window.scrollBy(0,500)");

        // get title , get url

        String url = js.executeScript("return document.URL;").toString();
        System.out.println(url);

        String title = js.executeScript("return document.title;").toString();
        System.out.println(title);

        // it is frame so need to do switch to indentify the id in frame
        driver.switchTo().frame("pact3");

        WebElement input_glaf = driver.findElement(By.id("glaf"));
        input_glaf.sendKeys("hi ");


    }


}
