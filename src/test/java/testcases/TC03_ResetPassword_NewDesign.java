package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage_NewDesign;
import pages.P04_ResetPassword;
import pages.P06_Checkout_Page;

import static testcases.TC02_Registration_NewDesign.Reg_email;
import static testcases.TC02_Registration_NewDesign.Reg_password;

public class TC03_ResetPassword_NewDesign extends Testbase{

    @Test(priority = 8,description = "Complete")
    public void Reset_password() throws InterruptedException {
        new P01_HomePage(driver).clickLoginTap();

        new P04_ResetPassword(driver).reset_link();
        new P04_ResetPassword(driver).enter_email(Reg_email).send();
        //Assert.assertEquals(new P06_Checkout_Page(driver).check_url(),"https://demo.nopcommerce.com/checkout/completed");

    }

    }
