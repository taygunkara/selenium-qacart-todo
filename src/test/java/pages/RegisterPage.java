package pages;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigUtils;

public class RegisterPage {


    private final static By firstnameInput = By.cssSelector("[data-testid=\"first-name\"]");
    private final static By lastnameInput = By.cssSelector("[data-testid=\"last-name\"]");
    private final static By emailInput = By.cssSelector("[data-testid=\"email\"]");
    private final static By passwordInput = By.cssSelector("[data-testid=\"password\"]");
    private final static By confirmPasswordInput = By.cssSelector("[data-testid=\"confirm-password\"]");
    private final static By signUpButton = By.cssSelector("[data-testid=\"submit\"]");


    private static RegisterPage registerPage;
    private RegisterPage(){};

    public static RegisterPage getInstance(){
        if (registerPage == null){
            registerPage = new RegisterPage();
        }
        return registerPage;
    }

    public void register(WebDriver driver, User user){
        driver.findElement(firstnameInput).sendKeys(user.getFirstName());
        driver.findElement(lastnameInput).sendKeys(user.getLastName());
        driver.findElement(emailInput).sendKeys(user.getEmail());
        driver.findElement(passwordInput).sendKeys(user.getPassword());
        driver.findElement(confirmPasswordInput).sendKeys(user.getPassword());
        driver.findElement(signUpButton).click();
    }

    public void loadRegisterPage(WebDriver driver){
        driver.get(ConfigUtils.getInstance().getBaseURL() + "/signup");
    }
}
