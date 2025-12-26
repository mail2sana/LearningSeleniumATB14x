package TestingAcadamyATB14x.ex02_Selenium_Basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Selenium_013_InterviewQues {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("bing.com"); // Without Https url run - No HTTPS is very important

    }
}
