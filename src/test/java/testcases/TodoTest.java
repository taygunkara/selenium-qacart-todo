package testcases;

import base.BaseTest;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NewTodoPage;
import pages.RegisterPage;
import pages.TodoPage;

public class TodoTest extends BaseTest {


    @Test(description = "Should be able to add a new todo task")
    public void shouldBeAbleToAddANewTodo(){
        User user = new User();
        RegisterPage.getInstance().loadRegisterPage(driver.get());
        RegisterPage.getInstance().registerUsingApi(driver.get(), user);
        TodoPage.getInstance().clickPlusIcon(driver.get());
        NewTodoPage.getInstance().createNewTodo(driver.get());
        Assert.assertTrue(TodoPage.getInstance().isTodoDisplayed(driver.get()));
    }


    @Test(description = "Should be able to delete a todo task")
    public void shouldBeAbleToDeleteATodo(){
        User user = new User();
        RegisterPage.getInstance().loadRegisterPage(driver.get());
        RegisterPage.getInstance().registerUsingApi(driver.get(), user);
        NewTodoPage.getInstance().createNewTodoUsingApi(driver.get(), user, "Be Happy!");
        TodoPage.getInstance().clickDeleteIcon(driver.get());
        Assert.assertTrue(TodoPage.getInstance().isNoTodosDisplayed(driver.get()));
    }

}
