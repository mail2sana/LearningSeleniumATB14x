package TestingAcadamyATB14x.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test_Selenium_012_Navigation_Get_Navigate {
    @Description("Open the url")
    @Test

    public void test_selenium(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
     //   navigate.to is same as get() extra function is refresh, backward , forward
        //Navigation Command
        // two ways to navigate the command
        // 1 . driver.get()
        // 2. driver.navigate().to

        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }

}
