package pages;

import org.openqa.selenium.By;

public class RegisterPage {


    // ELEMENTS
    private final static By firstnameInput = By.cssSelector("[data-testid=\"first-name\"]");
    private final static By lastnameInput = By.cssSelector("[data-testid=\"last-name\"]");
    private final static By emailInput = By.cssSelector("[data-testid=\"email\"]");
    private final static By passwordInput = By.cssSelector("[data-testid=\"password\"]");
    private final static By confirmPasswordInput = By.cssSelector("[data-testid=\"confirm-password\"]");
    private final static By signUpButton = By.cssSelector("[data-testid=\"submit\"]");

    // SINGLETON
    private static RegisterPage registerPage;
    private RegisterPage(){};

    public static RegisterPage getInstance(){
        if (registerPage == null){
            registerPage = new RegisterPage();
        }
        return registerPage;
    }

    // METHODS



}
