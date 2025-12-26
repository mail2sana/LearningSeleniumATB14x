package TestingAcadamyATB14x;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonToAll {
    //common functionality for all test cases
    public FirefoxDriver driver;

    public void OpenBrowser(WebDriver driver, String url){
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void CloseBrowser(WebDriver driver){
        try{
            Thread.sleep(5000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
