package testcases;

import Utility.Utilities;
import drivers.DriverFactory;
import drivers.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class Testbase extends Utilities {

    protected static WebDriver driver;

    @Parameters("browser")
    @BeforeTest
   public void setupDriver(String browser) {
       driver = DriverFactory.getNewInstance(browser);
       DriverHolder.setDriver(driver);

       driver.get("https://demo.nopcommerce.com/");
   }

    @AfterTest
    public void tearDown() {
        // driver.quit();
        // Thread.currentThread().interrupt();
    }
    }

