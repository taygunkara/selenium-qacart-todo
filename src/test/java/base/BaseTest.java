package base;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = DriverFactory.initializeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
