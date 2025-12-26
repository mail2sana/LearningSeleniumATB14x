package TestingAcadamyATB14x.ex02_Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Selenium_007_Commands {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://thetestingacademy.com/");

        // 3 commands
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit(); // it will close all the tabs
    }
}
