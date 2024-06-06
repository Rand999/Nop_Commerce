package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {


 WebDriver driver;

    public PageBase(WebDriver driver) {
        this.driver = driver;
    }


    private final By SEARCH_BOX = By.xpath("//input[@id='small-searchterms']");
    private final By CURRUNCY = By.xpath("//select[@id='customerCurrency']");




    public PageBase searchFunction(String keyword) {
        driver.findElement(this.SEARCH_BOX).sendKeys(keyword, Keys.ENTER);

        return this;
    }
    public PageBase convert_curruncy() {
        driver.findElement(this.CURRUNCY).click();
        return this;
    }

    public String check_url() {
     return  driver.getCurrentUrl();
    }

    public PageBase scroll_down() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,360)", "");
        return this;
    }

    public PageBase Wait() throws InterruptedException {
        Thread.sleep(1300);
        return this;
    }


 /*
    public PageBase(WebDriver driver){

        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='small-searchterms']")
    WebElement searchBox;

    @FindBy(xpath = "//select[@id='customerCurrency']")
    WebElement currancy;




    public void searchFunction(String keyword){
        searchBox.sendKeys(keyword, Keys.ENTER);
    }

    public void convert_currancy(){
        currancy.click();

    }
*/
}
