package TestingAcadamyATB14x.ex11_FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab37_FileUpload {

    @Test
    public void test_Upload(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        WebElement Upload_file = driver.findElement(By.id("fileToUpload"));
         String user_dir = System.getProperty("uesr.dir");

         System.out.println(user_dir);
         String path = user_dir + "/src/test/java/TestingAcadamyATB14x/ex11_FileUpload/TestData.txt";

         Upload_file.sendKeys(path);
         driver.findElement(By.name("submit")).click();

    }
}
