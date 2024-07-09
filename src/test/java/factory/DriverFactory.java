package factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {

    public static WebDriver initializeDriver(){
        WebDriver driver;
        String browser = System.getProperty("browser", "CHROME");

        switch (browser){
            case "CHROME" ->{
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
            case "FIREFOX" ->{
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            default -> throw new RuntimeException("Browser is not supported!");
        }

        driver.get("https://todo.qacart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }
}
