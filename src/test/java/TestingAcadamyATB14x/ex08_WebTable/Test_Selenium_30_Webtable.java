package TestingAcadamyATB14x.ex08_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Test_Selenium_30_Webtable {

    @Test

    public void test_Webtable() throws Exception{

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));

        // find rows tr
        List<WebElement> row_table = table.findElements(By.tagName("tr"));
        for (int i = 0; i < row_table.size() ; i++) {
            List<WebElement> cols=row_table.get(i).findElements(By.tagName("td"));

            for (WebElement c:cols){
                System.out.println(c.getText());
            }
            
        }




    }
}
