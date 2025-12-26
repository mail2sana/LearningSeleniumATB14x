package TestingAcadamyATB14x.ex02_Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Test_Selenium_002 {
@Test
    public void test_basic(){
        ChromeDriver driver=new ChromeDriver();
        //driver.get("https://www.google.com");
    driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
    //    driver.manage().window().maximize();
     //   driver.close();

    // Enter text in name fields
    driver.findElement(By.xpath("//input[@maxlength='61']")).sendKeys("Sangeetha");
//Radio button select
    List<WebElement>rd_button = driver.findElements(By.xpath("//input[@type='radio']"));
    rd_button.get(1).click();
    System.out.println(rd_button.get(1).isDisplayed());
    System.out.println(rd_button.get(1).isEnabled());
    System.out.println(rd_button.get(1).isSelected());

    // Dropdown button selection

    WebElement daylist= driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));

    Select day=new Select(daylist);
    day.selectByIndex(25);


    }
}
