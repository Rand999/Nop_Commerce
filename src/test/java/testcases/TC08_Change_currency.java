package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage_NewDesign;
import pages.PageBase;

import static testcases.TC02_Registration_NewDesign.Reg_email;
import static testcases.TC02_Registration_NewDesign.Reg_password;

public class TC08_Change_currency extends Testbase{

 @Test(priority = 8,description ="")
    public void Convert_Currancy() throws InterruptedException {
    new P01_HomePage(driver).clickLoginTap();

    new P03_LoginPage_NewDesign(driver).input_email(Reg_email).input_password(Reg_password).click_login_button();
    new PageBase(driver).Wait();;
    Assert.assertTrue(new P03_LoginPage_NewDesign(driver).check_login_logo(),"login faild");
    new PageBase(driver).Wait();

    String option="Euro";
    new PageBase(driver).convert_curruncy();
    new PageBase(driver).Wait();
    WebElement dropdown =driver.findElement(By.xpath("//select/option[contains(text(), '"+option+"')]"));
    dropdown.click();
    }
}








