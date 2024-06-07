package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.P01_HomePage;
import pages.P02_RegistrationPage_NewDesign;
import pages.P03_LoginPage_NewDesign;
import pages.PageBase;


import static testcases.TC02_Registration_NewDesign.Reg_email;
import static testcases.TC02_Registration_NewDesign.Reg_password;
import static testcases.Testbase.driver;

public class TC01_Login_NewDesign extends Testbase{

    @Test(priority = 1,description = "Login to System with Valid Data")
    public void Login_with_valid_data_P() throws InterruptedException {

        new P01_HomePage(driver).clickLoginTap();

        new P03_LoginPage_NewDesign(driver).input_email(Reg_email)
                .input_password(Reg_password).click_login_button();
        new PageBase(driver).Wait();
        Assert.assertTrue(new P03_LoginPage_NewDesign(driver).check_login_logo(),"login faild");
    }



}
