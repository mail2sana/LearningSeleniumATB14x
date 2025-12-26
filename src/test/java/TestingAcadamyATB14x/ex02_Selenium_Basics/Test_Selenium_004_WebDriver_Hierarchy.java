package TestingAcadamyATB14x.ex02_Selenium_Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test_Selenium_004_WebDriver_Hierarchy {
    public static void main(String[] args) {
        //webdriver hierarchy
        //SearchContext(I)->(2) ->WebDriver(I)(10)->RemoteWebDriver(C)(15)
        //ChromiumDriver(C) 25-> EdgeDriver(C)(45)

        //Searchcontext - interface - findelement , findelements - GGF
        //WebDriver - interface - some incomplete functions - GF
        //Remote WebDriver - class - it also has some functions - F
        //ChromeDriver, Firefox Driver, Edge driver, SafariDriver, InternetExplorerDriver class -s

        SearchContext driver = new FirefoxDriver();
        SearchContext driver1=new EdgeDriver();
        SearchContext driver2=new ChromeDriver();

        WebDriver driver3 = new FirefoxDriver();
        RemoteWebDriver driver4 = new FirefoxDriver();
        FirefoxDriver driver5 = new FirefoxDriver();

        // All are valid scenarios which one going to use

        //Sc1 : Want to use one browser means use direct one
        ChromeDriver driver6 = new ChromeDriver();

        // Sc2 : Want to use multiple driver and want to change
            WebDriver driver7 = new ChromeDriver();
            driver7 = new FirefoxDriver();
            driver7 = new EdgeDriver();

            // Sc3 : Want to run on multiple browser , aws machine? , remote machine
        // RemoteWebDriver driver (with GRID) - Advance











    }
}
