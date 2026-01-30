package TestingAcadamyATB14x.ex17_Selenium_DataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lab49_DDT_TestNG_POI_Real {

    @Test(dataProvider = "getData")
    public void test_vwo_login(String email , String password) {
        System.out.println(email + "-" + password);

    }
        @DataProvider
        // real time how to use by using fetch data from the excel file

        //read the excel file
        //convert the data R, C into the data[][]
        // return new object[][]

        public Object[][] getData(){
            return UtilExcel.getTestDataFromExcel("sheet1");

            }

}


