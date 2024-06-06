package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class P04_ResetPassword {


    WebDriver driver;

    public P04_ResetPassword(WebDriver driver) {
        this.driver = driver;
    }

    private final By FORRGET_PASS_LINK = By.xpath("//a[normalize-space()='Forgot password?']");
    private final By EMAIL = By.xpath("//input[@name='Email']");
    private final By RECOVER = By.xpath("//button[@name='send-email']");



    public P04_ResetPassword reset_link() {
        driver.findElement(this.FORRGET_PASS_LINK).click();
        return this;
    }
    public P04_ResetPassword enter_email(String email) {
        driver.findElement(this.EMAIL).sendKeys(email);

        return this;
    }
    public P04_ResetPassword send() {
        driver.findElement(this.RECOVER).click();
        return this;
    }

    public String check_url() {
        return  driver.getCurrentUrl();
    }


    /*
WebDriver driver;
    public P04_ResetPassword(WebDriver driver){
        PageFactory.initElements(driver ,this);
        this.driver = driver;
    }


    @FindBy(xpath = "//input[@name='Email']")
    WebElement email;

    @FindBy(xpath = "//button[@name='send-email']")
    WebElement recover;

    public void forrgetPpassword(String email){
       this.email.sendKeys(email);
      this.recover.click();
    }
*/
}
