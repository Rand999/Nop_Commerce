package testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_RegistrationPage;
import pages.P03_LoginPage;
import pages.P04_ResetPassword;

import java.time.Duration;

import static testcases.TC02_Registration.Reg_email;
import static testcases.TC02_Registration.Reg_password;

public class TC04_ResetPassword extends Testbase{
String email = Reg_email;

/*
P01_HomePage loginTap ;
    P04_ResetPassword reset ;
    P03_LoginPage  loginPage ;

    @Test()
    public void Reset_password(){
         loginTap = new P01_HomePage(driver);
         reset = new P04_ResetPassword(driver);
         loginPage = new P03_LoginPage(driver);


        loginTap.clickLoginTap();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        loginPage.click_reset_link();
        reset.forrgetPpassword(Reg_email);
        System.out.println(Reg_email);

    }
*/
}
