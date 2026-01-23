package TestingAcadamyATB14x.ex08_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Mini_Project_WebTable {

    @Test
    public void Proj_Webtable(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/pim/viewEmployeeList");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement un = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
        un.sendKeys("admin");

        WebElement psw = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        psw.sendKeys("Hacker@4321");

        WebElement button = driver.findElement(By.xpath("//button"));
        button.click();
// Selecting the PIM Submenu from left side
        WebElement pim = driver.findElement(By.xpath("//a[@class=\"oxd-main-menu-item active\"]"));
        pim.click();

        // Select the employeelist page on PIM
        WebElement employee = driver.findElement(By.partialLinkText("Employee List"));
        employee.click();

        // //div[@class="orangehrm-container"]
        WebElement table = driver.findElement(By.xpath("//div[@class=\"orangehrm-container\"]"));
        List<WebElement> row_table = table.findElements(By.tagName("row"));
        for (int i = 0; i < row_table.size() ; i++) {

            List<WebElement>col = row_table.get(i).findElements(By.tagName("cell"));

            for (WebElement c:col){
                System.out.println(c.getText());
            }
        }
            }
}
