package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_RegistrationPage;
import pages.P03_LoginPage;

import java.time.Duration;

public class TC02_Registration extends Testbase{

    // Step1: define pages
    P01_HomePage homePage;
    P02_RegistrationPage registrationPage;

    P03_LoginPage loginpage;

    // define test data
    String firstName=Utility.Utilities.getRandomFirstName();
    String lastName=Utility.Utilities.getRandomLasttName();
     static String Reg_email=Utility.Utilities.getRandomEmail();
    String comapnyName=Utility.Utilities.getRandomcompany();
    static String Reg_password=Utility.Utilities.generateRandomPassword(9,1,7,5,1);
   // String password_confirm = Reg_password;



    @Test(priority = 1,description = "Register New User With Valid Data")
    public void registerNewUserWithValidData_P(){
        homePage=new P01_HomePage(driver);
        registrationPage=new P02_RegistrationPage(driver);

        homePage.clickRegisterTap();
        registrationPage.registerNewUser(firstName,lastName,Reg_email,comapnyName,Reg_password);

        System.out.println(Reg_email);
        System.out.println(Reg_password);

    }

    //login after regester
   /* @Test(priority = 1,description = "Register New User With Valid Data")
    public void registerNewUserWithValidData_P(){
        homePage=new P01_HomePage(driver);
        registrationPage=new P02_RegistrationPage(driver);
        loginpage = new P03_LoginPage(driver);

        homePage.clickRegisterTap();
        registrationPage.registerNewUser(firstName,lastName,email,comapnyName,password,password_confirm);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            System.out.println(email+"****  "+password);

        driver.findElement(By.xpath("//a[@href='/logout']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        homePage.clickLoginTap();
        loginpage.loginAsUser(email,password);
        System.out.println(email+" **** "+password);
    }

    @Test(priority = 1,description = "Register New User With Invalid Email")
    public void registerNewUserWithValidData_N(){
        homePage=new P01_HomePage(driver);
        registrationPage=new P02_RegistrationPage(driver);

        email="12312!@#12!@#@!@sss";

        homePage.clickRegisterTap();
        registrationPage.registerNewUser(firstName,lastName,email,comapnyName,password,password);
    }*/
}
