package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_LoginPage_NewDesign {

    WebDriver driver;

    public P03_LoginPage_NewDesign(WebDriver driver) {
        this.driver = driver;
    }


    private final By EMAIL = By.xpath("//input[@name='Email']");
    private final By PASSWORD = By.xpath("//input[@name='Password']");
    private final By LOGIN_BUTTON = By.xpath("//button[@class='button-1 login-button']");
    private final By RESET_LINK = By.xpath("//a[@href='/passwordrecovery']");



    public P03_LoginPage_NewDesign input_email(String email) {
        driver.findElement(this.EMAIL).sendKeys(email);
        return this;
    }
    public P03_LoginPage_NewDesign input_password(String pass) {
        driver.findElement(this.PASSWORD).sendKeys(pass);
        return this;
    }

    public P03_LoginPage_NewDesign click_login_button() {
        driver.findElement(this.LOGIN_BUTTON).click();
        return this;
    }

    public P03_LoginPage_NewDesign click_reset_link() {
        driver.findElement(this.RESET_LINK).click();
        return this;
    }

public boolean check_login_logo(){
        return driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
}


}
