package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage_NewDesign;
import pages.P05_Add_product_Page;
import pages.PageBase;

import static testcases.TC02_Registration_NewDesign.Reg_email;
import static testcases.TC02_Registration_NewDesign.Reg_password;

public class TC05_Add_to_cart extends Testbase{


    @Test(priority = 4,description = "Add product to cart")
    public void Add_product_to_cart_P() throws InterruptedException {

        new P01_HomePage(driver).clickLoginTap();

        new P03_LoginPage_NewDesign(driver).input_email(Reg_email).input_password(Reg_password).click_login_button();
        new PageBase(driver).Wait();
        Assert.assertTrue(new P03_LoginPage_NewDesign(driver).check_login_logo(),"login faild");

        new P05_Add_product_Page(driver).click_on_category().click_on_product().clickAddtocart();
        new PageBase(driver).Wait();
        new PageBase(driver).Wait();
        Assert.assertTrue(new P05_Add_product_Page(driver).check_added_tocart(),"NOT added to cart");

    }

}
