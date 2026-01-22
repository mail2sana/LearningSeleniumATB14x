package TestingAcadamyATB14x.ex05_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium22_Waits {

    @Owner("Sangeetha")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Login is working")
    @Test
    public void ImplicitWaits(){

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://app.vwo.com/#/login");

    }

}
