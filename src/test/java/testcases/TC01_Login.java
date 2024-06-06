package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_RegistrationPage;
import pages.P03_LoginPage;
import pages.PageBase;

import java.time.Duration;
import java.util.List;

import static testcases.TC02_Registration.Reg_email;
import static testcases.TC02_Registration.Reg_password;

public class TC01_Login extends Testbase{

    // define pages
    P01_HomePage homePage;
    P03_LoginPage loginPage;

    //P02_RegistrationPage regester;
    PageBase BasePage;

    @Test(priority = 2,description = "Login to System with Valid Data")
    public void loginWithValidData_P(){
        homePage=new P01_HomePage(driver);
        loginPage=new P03_LoginPage(driver);
        //regester= new P02_RegistrationPage(driver);

        homePage.clickLoginTap();




        //driver.findElement(By.xpath("//a[@href='/logout']")).click();

        loginPage.loginAsUser(Reg_email,Reg_password);
        System.out.println(Reg_email + "  " +Reg_password);

    }



  /*  @Test(priority = 4,description = "Login users can search")
    public void loginUserCanSearch_P(){
        homePage=new P01_HomePage(driver);
        loginPage=new P03_LoginPage(driver);
        BasePage=new PageBase(driver);


        homePage.clickLoginTap();
        loginPage.loginAsUser(Reg_email,Reg_password);
        BasePage.searchFunction("Desktops");



    }*/
//********************************************************************************

  /*@Test(priority = 4,description = "switch between carrany")
    public void swithCurrancy_P(){
        homePage=new P01_HomePage(driver);
        loginPage=new P03_LoginPage(driver);

        homePage.clickLoginTap();
        loginPage.loginAsUser(Reg_email,Reg_password);

       // homePage.



    }*/
    //*******************************************************************************


  /* @Test(priority = 2,description = "Login to System with Invalid email and valid password")
    public void loginWithInvalidEmail_N() {
        homePage=new P01_HomePage(driver);
        loginPage=new P03_LoginPage(driver);

        email=email;
        homePage.clickLoginTap();
        loginPage.loginAsUser(email,password);
    }
    @Test(priority = 3,description = "Login to System with Valid email and Invalid password")
    public void loginWithInvalidPassword_N(){
        homePage=new P01_HomePage(driver);
        loginPage=new P03_LoginPage(driver);

        email="test@test.com";
        password="12345678";
        homePage.clickLoginTap();
        loginPage.loginAsUser(email,password);
    }
    @Test(priority = 4,description = "Login to System with Invalid email and Invalid password")
    public void loginWithInvalidData_N(){
        homePage=new P01_HomePage(driver);
        loginPage=new P03_LoginPage(driver);

        email="demo@demo.com";
        homePage.clickLoginTap();
        loginPage.loginAsUser(email,password);
    }*/


   /* @Test(priority = 8,description ="")
    public void Convert_Currancy(){
        homePage=new P01_HomePage(driver);
        loginPage=new P03_LoginPage(driver);
        BasePage = new PageBase(driver);

        BasePage.convert_currancy();

        String option="Euro";

        WebElement dropdown =driver.findElement(By.xpath("//select/option[contains(text(), '"+option+"')]"));

        dropdown.click();
    }*/




}
