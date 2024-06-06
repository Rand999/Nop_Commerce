package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage_NewDesign;

import static testcases.TC02_Registration_NewDesign.Reg_email;
import static testcases.TC02_Registration_NewDesign.Reg_password;

public class TC04_AddProduct_NewDesign {

  /*  @Test(priority = 2,description = "Login to System with Valid Data")
    public void Login_with_valid_data() throws InterruptedException {

        new P01_HomePage(driver).clickLoginTap();

        new P03_LoginPage_NewDesign(driver).input_email(Reg_email).input_password(Reg_password).click_login_button();
        Thread.sleep(1000);
        Assert.assertTrue(new P03_LoginPage_NewDesign(driver).check_login_logo(),"login faild");
    }*/

}
