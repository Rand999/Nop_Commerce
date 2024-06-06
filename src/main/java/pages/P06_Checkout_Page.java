package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P06_Checkout_Page {



    WebDriver driver;

    public P06_Checkout_Page(WebDriver driver) {
        this.driver = driver;
    }


    private final By COUNTRY = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    private final By COUNTRY_SELECT = By.xpath("//select[@id='BillingNewAddress_CountryId']/option[3]");
    private final By CITY = By.xpath("//input[@id='BillingNewAddress_City']");
    private final By ADDRESS1 = By.xpath("//input[@id='BillingNewAddress_Address1']");
    private final By ZIP = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    private final By PHONE_NUM = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    private final By CONTINUE_BUTTON = By.xpath("//button[@class='button-1 new-address-next-step-button']");
    private final By CONTINUE_BUTTON_PAYMENT = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    private final By CONTINUE_BUTTON_PAYMENT_INFO = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    private final By CONTINUE_BUTTON_CONFIRM_ORDER = By.xpath("//button[normalize-space()='Confirm']");


    public P06_Checkout_Page select_country() {
        driver.findElement(this.COUNTRY).click();
        driver.findElement(this.COUNTRY_SELECT).click();
        return this;
    }
    public P06_Checkout_Page input_city_name(String city) {
        driver.findElement(this.CITY).sendKeys(city);
        return this;
    }

    public P06_Checkout_Page input_address(String address) {
        driver.findElement(this.ADDRESS1).sendKeys(address);
        return this;
    }

    public P06_Checkout_Page input_ZIP(String zip) {
        driver.findElement(this.ZIP).sendKeys(zip);
        return this;
    }


    public P06_Checkout_Page input_phone(String phone) {
        driver.findElement(this.PHONE_NUM).sendKeys(phone);
        return this;
    }

    public P06_Checkout_Page continue_button() {
        driver.findElement(this.CONTINUE_BUTTON).click();
        return this;
    }




    public P06_Checkout_Page continue_pay_method() {
        driver.findElement(this.CONTINUE_BUTTON_PAYMENT).click();
        return this;
    }



    public P06_Checkout_Page continue_pay_info() {
        driver.findElement(this.CONTINUE_BUTTON_PAYMENT_INFO).click();
        return this;
    }

    public P06_Checkout_Page continue_to_confirm_order() {
        driver.findElement(this.CONTINUE_BUTTON_CONFIRM_ORDER).click();
        return this;
    }

    public boolean check_final_message() {
 return   driver.findElement(By.xpath("//h1[normalize-space()='Thank you']")).isDisplayed();

    }

    public String check_url() {
     return  driver.getCurrentUrl();
    }

}
