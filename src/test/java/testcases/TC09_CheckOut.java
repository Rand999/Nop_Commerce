package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static testcases.TC02_Registration_NewDesign.Reg_email;
import static testcases.TC02_Registration_NewDesign.Reg_password;

public class TC09_CheckOut extends Testbase{

    @Test(priority = 8,description = "Complete")
    public void Add_product_to_cart_then_checkout() throws InterruptedException {

        new P01_HomePage(driver).clickLoginTap();

        new P03_LoginPage_NewDesign(driver).input_email(Reg_email).
                input_password(Reg_password).click_login_button();
        new PageBase(driver).Wait();
        Assert.assertTrue(new P03_LoginPage_NewDesign(driver).check_login_logo(),"login faild");

        new P05_Add_product_Page(driver).
                click_on_category().click_on_product().clickAddtocart();
        new PageBase(driver).Wait();
        new PageBase(driver).Wait();
        new P05_Add_product_Page(driver).CLICK_ON_CART();
        new PageBase(driver).Wait();


        new P05_Add_product_Page(driver).CLICK_ON_terms_policy().CLICK_ON_chickout();
        new PageBase(driver).Wait();
        new P06_Checkout_Page(driver).select_country().
                input_city_name("Amman").input_address("jubaiha")
                .input_ZIP("54545545").input_phone("0478787545");
        new PageBase(driver).scroll_down();
        new P06_Checkout_Page(driver).continue_button();

        new PageBase(driver).Wait();
        new P06_Checkout_Page(driver).continue_pay_method();
        new PageBase(driver).Wait();
        new P06_Checkout_Page(driver).continue_pay_info();
        new PageBase(driver).Wait();
        new P06_Checkout_Page(driver).continue_to_confirm_order();
        new PageBase(driver).Wait();
        Assert.assertTrue(new P06_Checkout_Page(driver).check_final_message(),"order not be set");
        Assert.assertEquals(new P06_Checkout_Page(driver).check_url(),"https://demo.nopcommerce.com/checkout/completed");

    }

}
