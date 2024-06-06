package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_RegistrationPage_NewDesign {

    // 1- define webdriver
    // 2- define constructor and initialize webdriver
    // 3- define locators using By
    // 4- define action methods for each locator
    WebDriver driver;

    public P02_RegistrationPage_NewDesign(WebDriver driver) {
        this.driver = driver;
    }

    private final By GENDER = By.id("gender-male");
    private final By FIRST_TEXT = By.xpath("//input[@id='FirstName']");
    private final By LAST_TEXT = By.xpath("//input[@id='LastName']");
    private final By EMAIL_TEXT = By.xpath("//input[@id='Email']");
    private final By COMPANY_NAME = By.xpath("//input[@id='Company']");
    private final By PASSWORD = By.xpath("//input[@id='Password']");
    private final By PASS_CONFIRM = By.xpath("//input[@name='ConfirmPassword']");
    private final By CLICK_REG = By.xpath("//button[@name='register-button']");


    public P02_RegistrationPage_NewDesign Check_gender() {
        driver.findElement(this.GENDER).click();
        return this;
    }
    public P02_RegistrationPage_NewDesign input_first_name(String f_name) {
        driver.findElement(this.FIRST_TEXT).sendKeys(f_name);
        return this;
    }

    public P02_RegistrationPage_NewDesign input_last_name(String l_name) {
        driver.findElement(this.LAST_TEXT).sendKeys(l_name);
        return this;
    }

    public P02_RegistrationPage_NewDesign input_email(String email) {
        driver.findElement(this.EMAIL_TEXT).sendKeys(email);
        return this;
    }


    public P02_RegistrationPage_NewDesign input_company_name(String company_name) {
        driver.findElement(this.COMPANY_NAME).sendKeys(company_name);
        return this;
    }

    public P02_RegistrationPage_NewDesign input_password(String pass) {
        driver.findElement(this.PASSWORD).sendKeys(pass);
        return this;
    }

    public P02_RegistrationPage_NewDesign input_confirm_pass(String con_pass) {
        driver.findElement(this.PASS_CONFIRM).sendKeys(con_pass);
        return this;
    }

    public P02_RegistrationPage_NewDesign Click_button() {
        driver.findElement(this.CLICK_REG).click();
        return this;
    }

    public String check_URL() {
     return  driver.getCurrentUrl();

    }

    public boolean check_text() {
        return  driver.findElement(By.xpath("//*[text()[contains(.,'Your registration completed')]]")).isDisplayed();

    }
}
//