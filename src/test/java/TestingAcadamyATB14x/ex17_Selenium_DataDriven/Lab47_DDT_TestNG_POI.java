package TestingAcadamyATB14x.ex17_Selenium_DataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab47_DDT_TestNG_POI {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String username , String password) {
        System.out.println("Multiple login i have to check");
        System.out.println(username + "-" + password);
        System.out.println();
    }
        @DataProvider
                public Object[][] getData(){
            return new Object[][]{
                    new Object[]{"admin@gmail.com" , "pass123" },
                    new Object[]{"admin123@gmail.com" , "pass123" },
                    new Object[]{"admin@gmail.com" , "pass1230" },
                    new Object[]{"admin@gmail.com" , "pass123456789" }

                    // real time how to use by using fetch data from the excel file

            };

        }

    }

