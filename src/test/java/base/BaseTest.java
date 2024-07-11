package base;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setUp(){
        WebDriver driver = DriverFactory.initializeDriver();
        this.driver.set(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.get().quit();
    }

}
