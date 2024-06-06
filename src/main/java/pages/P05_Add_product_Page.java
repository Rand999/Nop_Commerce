package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_Add_product_Page {

    WebDriver driver;

    public P05_Add_product_Page(WebDriver driver) {
        this.driver = driver;
    }


    private final By SELECT_CATEGORY = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
    private final By SELECT_PRODUCT = By.xpath("//h2[@class='product-title']//a[normalize-space()='If You Wait (donation)']");

    private final By ADD_TO_CART = By.xpath("//button[@id='add-to-cart-button-35']");

    private final By ADD_TO_WISHLIST = By.xpath("//button[@id='add-to-wishlist-button-35']");

    private final By ADD_TO_COMPARE_LIST = By.xpath("//div[@class='compare-products']//button[@type='button'][normalize-space()='Add to compare list']");

    private final By CART_LINK = By.xpath("//span[@class='cart-label']");

    private final By CHECKOUT_BUTTON = By.xpath("//button[@id='checkout']");

    private final By TERMS_POLICY = By.xpath("//input[@id='termsofservice']");

    public P05_Add_product_Page click_on_category() {
        driver.findElement(this.SELECT_CATEGORY).click();
        return this;
    }

    public P05_Add_product_Page click_on_product() {
        driver.findElement(this.SELECT_PRODUCT).click();
        return this;
    }


    public P05_Add_product_Page clickAddtocart() {
        driver.findElement(this.ADD_TO_CART).click();
        return this;
    }

    public P05_Add_product_Page clickAdd_wishlist() {
        driver.findElement(this.ADD_TO_WISHLIST).click();
        return this;
    }

    public P05_Add_product_Page clickAdd_compare_list() {
        driver.findElement(this.ADD_TO_COMPARE_LIST).click();
        return this;
    }

    public boolean check_added_tocart() {
      return  driver.findElement(By.xpath("//p[@class='content']")).isDisplayed();

    }


    public boolean check_added_towishlist() {
        return  driver.findElement(By.xpath("//p[@class='content']")).isDisplayed();

    }

    public boolean check_added_compare_list() {
        return  driver.findElement(By.xpath("//p[@class='content']")).isDisplayed();

    }

    public P05_Add_product_Page CLICK_ON_CART() {
          driver.findElement(this.CART_LINK).click();
        return this;

    }

    public P05_Add_product_Page CLICK_ON_chickout() {
        driver.findElement(this.CHECKOUT_BUTTON).click();
        return this;

    }

    public P05_Add_product_Page CLICK_ON_terms_policy() {
        driver.findElement(this.TERMS_POLICY).click();
        return this;

    }

////input[@id='termsofservice']
}
