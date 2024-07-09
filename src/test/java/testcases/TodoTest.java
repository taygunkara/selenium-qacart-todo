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
    public void shouldBeAbleToAddATodo(){
        User user = new User();
        RegisterPage.getInstance().loadRegisterPage(driver);
        RegisterPage.getInstance().register(driver, user);
        TodoPage.getInstance().loadTodoPage(driver);
        TodoPage.getInstance().clickPlusIcon(driver);
        NewTodoPage.getInstance().createNewTodoItem(driver);
        Assert.assertTrue(TodoPage.getInstance().isTodoDisplayed(driver));
    }


    @Test(description = "Should be able to delete a todo task")
    public void shouldBeAbleToDeleteATodo(){
        User user = new User();
        RegisterPage.getInstance().loadRegisterPage(driver);
        RegisterPage.getInstance().register(driver, user);
        TodoPage.getInstance().loadTodoPage(driver);
        TodoPage.getInstance().clickPlusIcon(driver);
        NewTodoPage.getInstance().createNewTodoItem(driver);
        TodoPage.getInstance().clickDeleteIcon(driver);
        Assert.assertTrue(TodoPage.getInstance().isNoTodosDisplayed(driver));
    }

}
