package TestingAcadamyATB14x.ex02_Selenium_Basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_Selenium_002 {
@Test
    public void test_basic(){
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
    }
}
