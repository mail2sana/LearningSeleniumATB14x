package TestingAcadamyATB14x.ex02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Selenium_003 {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        //selenium 3 using means have to use this  statement
        // System.getProperty("webdriver.gecko.driver","/path/geckdriver");


        // new FirefoxDriver(); Start the selenium session
        // session - fresh copy of browser is started!
        // POST request of the server - Firefox Driver
        driver.get("https://sdet.live");
        // command 2 - POSt request give to the driver to navigate to URL

    }
}
