package TestingAcadamyATB14x.ex16_Selenium_Exception;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lab45_Selenium_Exception {
    @Test
    public void test_excception(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");

        //id not found - No such element exception will throw
        try {
            driver.findElement(By.id("pramod")); // org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#pramod"}

       } catch (NoSuchElementException e){
            System.out.println("Element Not Found");
        }


//How to fix it - by using try catch






    }
}
