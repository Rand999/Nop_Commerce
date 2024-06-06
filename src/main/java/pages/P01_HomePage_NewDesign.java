package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class P01_HomePage_NewDesign {


    WebDriver driver;

    public P01_HomePage_NewDesign(WebDriver driver) {
        this.driver = driver;
    }


    private final By LOGINTAB = By.xpath("*//a[text()='Log in']");
    private final By REGTAB = By.xpath("*//a[text()='Register']");


    public P01_HomePage_NewDesign clickLoginTap() {
        driver.findElement(this.LOGINTAB).click();
        return this;
    }

    public P01_HomePage_NewDesign clickRegisterTap() {
        driver.findElement(this.REGTAB).click();
        return this;
    }


}
