package TestingAcadamyATB14x.ex02_Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Test_Selenium_016_Mini_Project_Add_Extension {

    @Description ("Option Class")
    @Test

    public void Test_addExtension() throws Exception {

        ChromeOptions chromeOptions = new ChromeOptions();
     //   chromeOptions.addArguments("--window-size=1920,1080");
    //    chromeOptions.addArguments("--incognito");
        File path = new File("");
        chromeOptions.addExtensions(path);


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/watch?v=a2IQvGA-gdE");

        Thread.sleep(5000);

        driver.quit();
    }
}
