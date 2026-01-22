package TestingAcadamyATB14x.ex06_Selenium_Input_Alerts_DropDwn_Radio_Check;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test_Selenium_27_Select_Static  {

    @Test
    public void test_SelectBox(){
        // 2 types of drop down
        //1.Select Static drop down - Normal Select Box
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        //Dropdown selection by using select class
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select select = new Select(dropdown);
       // select.selectByIndex(1);
        select.selectByVisibleText("Option 2");

    }
}
