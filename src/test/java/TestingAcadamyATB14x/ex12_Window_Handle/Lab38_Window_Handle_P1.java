package TestingAcadamyATB14x.ex12_Window_Handle;

import TestingAcadamyATB14x.ex07_WaitHelpers.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class Lab38_Window_Handle_P1 {

    @Test
    public void test_wndHndl(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        new WaitHelpers().waitJVM(2000);

        String parent_id = driver.getWindowHandle();
        System.out.println(parent_id); // 3C0FCC75B24D332120E8034D047D9FBC

        new WaitHelpers().waitJVM(2000);

        WebElement link_parent = driver.findElement(By.xpath("//a[text()='Click Here']"));
        link_parent.click();

        Set <String> Wind_Handles = driver.getWindowHandles();

        for ( String window : Wind_Handles){
            System.out.println(window);
            driver.switchTo().window(window);

            if (driver.getPageSource().contains("New Window")){
                System.out.println("Test PAssed");
            }
        }
        //in the end i'm switching back to my parents
        driver.switchTo().window(parent_id);
    }
}
