package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.P01_HomePage;
import pages.P02_RegistrationPage_NewDesign;
import pages.PageBase;

import static testcases.Testbase.driver;

public class TC02_Registration_NewDesign  extends Testbase{


     String firstName=Utility.Utilities.getRandomFirstName();
    String lastName=Utility.Utilities.getRandomLasttName();
     static String Reg_email;
    String comapnyName=Utility.Utilities.getRandomcompany();
    static String Reg_password=Utility.Utilities.generateRandomPassword(9,1,7,5,1);




    // check login positive scenarios
    @Test(priority = 3, description = "register with Valid Username and Password")
    public void Regester_WithValidData_P() throws InterruptedException {
        Reg_email= Utility.Utilities.getRandomEmail();
        new P01_HomePage(driver).clickRegisterTap();
        new P02_RegistrationPage_NewDesign(driver).Check_gender().input_first_name(firstName).input_last_name(lastName).input_email(Reg_email).input_company_name(comapnyName).input_password(Reg_password).input_confirm_pass(Reg_password).Click_button();
        new PageBase(driver).Wait();
        Assert.assertEquals(new P02_RegistrationPage_NewDesign(driver).check_URL(),"https://demo.nopcommerce.com/registerresult/1?returnUrl=/");

        Assert.assertTrue(new P02_RegistrationPage_NewDesign(driver).check_text(),"regestered");

    }







   /* @Test(priority = 2, description = "Login with Invalid Username ")
    public void loginWithInvalidUserName_N() {
        new P01_LoginPage(driver).inputEmail(user).inputPassword(password).clickLoginButton();
    }

    @Test(priority = 3, description = "Login with Invalid Password")
    public void loginWithInvalidPassword_N() {
        new P01_LoginPage(driver).inputEmail(user).inputPassword(password).clickLoginButton();
    }

    @Test(priority = 4, description = "Login with Invalid email and Password")
    public void loginWithValidData_N() {
        new P01_LoginPage(driver).inputEmail(user).inputPassword(password).clickLoginButton();
    }

    */

}
