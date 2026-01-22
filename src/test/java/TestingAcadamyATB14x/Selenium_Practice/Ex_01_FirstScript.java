package TestingAcadamyATB14x.Selenium_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_01_FirstScript {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        System.out.println(title);

     //   driver.close();


    }
}
