package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_LoginPage {
  // public  WebDriver driver;

    // TODO: Step1: Constructor
    public P03_LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
       // this.driver = driver;
    }

    // TODO step2: define locators
    @FindBy(xpath = "//input[@name='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@name='Password']")
    WebElement password;
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement loginButton;

    @FindBy(xpath = "//a[@href='/passwordrecovery']")
    WebElement reset_link;

    // TODO: step3 define action methods
    public void loginAsUser(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        this.loginButton.click();
    }

    public void click_reset_link(){
        reset_link.click();
    }
}
