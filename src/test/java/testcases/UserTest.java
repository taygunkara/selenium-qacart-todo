package testcases;

import base.BaseTest;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegisterPage;
import pages.TodoPage;

public class UserTest extends BaseTest {

    @Test(description = "Should be able to register to application")
    public void shouldBeAbleToRegisterToApplication(){
        User user = new User();
        RegisterPage.getInstance().loadRegisterPage(driver.get());
        RegisterPage.getInstance().register(driver.get(), user);
        Assert.assertTrue(TodoPage.getInstance().isWelcomeDisplayed(driver.get()));
    }

}
