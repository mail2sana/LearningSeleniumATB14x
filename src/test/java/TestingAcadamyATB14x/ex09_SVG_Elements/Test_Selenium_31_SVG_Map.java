package TestingAcadamyATB14x.ex09_SVG_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Test_Selenium_31_SVG_Map {
    @Test
    public void testSVGDiff(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();

        //find all states of svg - //*[name()='svg']/*[name()="g"][7]/*[name()="g"]/*[name()="g"]/*[name()="path"]

       List<WebElement> map =  driver.findElements(By.xpath("//*[name()='svg']/*[name()=\"g\"][7]/*[name()=\"g\"]/*[name()=\"g\"]/*[name()=\"path\"]"));
        for (WebElement states : map){
            System.out.println(states.getAttribute("aria-label"));
            if (states.getAttribute("aria-label").contains("Tamil Nadu")){
                states.click();
            }
        }
    }
}
