package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_RegistrationPage {
//WebDriver driver;
    public P02_RegistrationPage(WebDriver driver){
        PageFactory.initElements(driver,this);
       // this.driver = driver;
    }
    @FindBy(id="gender-male")
    WebElement gender;

    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNAme;

    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    @FindBy(xpath = "//input[@id='Company']")
    WebElement companyName;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;

    @FindBy(xpath = "//input[@name='ConfirmPassword']")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[@name='register-button']")
    WebElement registerButton;

    public void registerNewUser(String firstName,String lastName,String Reg_email,String CompanyName,String Reg_password){
        this.gender.click();
        this.firstName.sendKeys(firstName);
        this.lastNAme.sendKeys(lastName);
        this.email.sendKeys(Reg_email);
        this.companyName.sendKeys(CompanyName);
        this.password.sendKeys(Reg_password);
        this.confirmPassword.sendKeys(Reg_password);
        this.registerButton.click();
    }

}
