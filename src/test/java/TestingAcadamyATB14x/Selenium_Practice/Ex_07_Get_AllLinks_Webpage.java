package TestingAcadamyATB14x.Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex_07_Get_AllLinks_Webpage {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        // get all <a >tags
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links on page"+ links.size());

        // print link text and url
        for (WebElement link:links){
            String linktext = link.getText();
            String url = link.getAttribute("href");
        }


    }
}
