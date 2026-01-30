package TestingAcadamyATB14x.ex17_Selenium_DataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab48_DDT_TestNG_POI_Steps {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String email , String password) {
        System.out.println(email + "-" + password);
    }
        @DataProvider
                public Object[][] getData(){
        // real time how to use by using fetch data from the excel file

            //read the excel file
            //convert the data R, C into the data[][]
            // return new object[][]

            return null;

            };

        }

