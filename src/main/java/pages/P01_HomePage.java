package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_HomePage {


    WebDriver driver;

    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
    }


    private final By LOGINTAB = By.xpath("*//a[text()='Log in']");
    private final By REGTAB = By.xpath("*//a[text()='Register']");


    public P01_HomePage clickLoginTap() {
        driver.findElement(this.LOGINTAB).click();
        return this;
    }

    public P01_HomePage clickRegisterTap() {
        driver.findElement(this.REGTAB).click();
        return this;
    }


}