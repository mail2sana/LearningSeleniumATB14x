package TestingAcadamyATB14x.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Selenium_014_Close_Vs_Quit {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        Thread.sleep(5000);

                    driver.close(); // it will close the current tab alone , not the sessions, not all the tabs
        //session id!=null

        driver.quit();
// it will close all the tabs


    }
}
