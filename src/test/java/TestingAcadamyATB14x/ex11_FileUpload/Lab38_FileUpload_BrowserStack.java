package TestingAcadamyATB14x.ex11_FileUpload;

import TestingAcadamyATB14x.ex07_WaitHelpers.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab38_FileUpload_BrowserStack {
    @Test
    public  void test_FileUpload(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/users/sign_in");
        driver.manage().window().maximize();

        new WaitHelpers().waitJVM(2000);

        WebElement UN = driver.findElement(By.id("user_email_login"));
        UN.sendKeys("lnn76@1secmail.website");

        new WaitHelpers().waitJVM(2000);

        WebElement PWD = driver.findElement(By.id("user_password"));
        PWD.sendKeys("lnn76@1secmail.website");

        new WaitHelpers().waitJVM(2000);

        WebElement signIn = driver.findElement(By.id("user_submit"));
        signIn.click();

        new WaitHelpers().waitJVM(2000);






    }
}
