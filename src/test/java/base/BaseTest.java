package base;

import factory.DriverFactory;
import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class BaseTest {
    protected ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setUp(){
        WebDriver driver = DriverFactory.initializeDriver();
        this.driver.set(driver);
    }

    @AfterMethod
    public void tearDown(ITestResult result){
        String testCaseName = result.getMethod().getMethodName();
        File destinationFile = new File("target" + File.separator + "screenshots" + File.separator
                + testCaseName + ".png");
        takeScreenshot(destinationFile);
        driver.get().quit();
    }


    public void takeScreenshot(File destinationFile) {
        File file = ((TakesScreenshot) driver.get()).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(file, destinationFile);
            InputStream inputStream = new FileInputStream(destinationFile);
            Allure.addAttachment("screenshot", inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
