package TestingAcadamyATB14x.ex02_Selenium_Basics;
import io.qameta.allure.Description;
import org.assertj.core.api.WithAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test_Selenium_009_Assertion_TestNG {

    @Description("Open the URL")
    @Test
    public void test_selenium01(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");

        //Test NG
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.google.com");
        //AssertJ Validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://www.google.com");

        driver.quit();
    }

}
