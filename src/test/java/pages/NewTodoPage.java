package pages;

import apis.TodoApi;
import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewTodoPage {

    public final static By todoItemInput = By.cssSelector("[data-testid=\"new-todo\"]");
    public final static By createTodoButton = By.cssSelector("[data-testid=\"submit-newTask\"]");

    private static NewTodoPage newTodoPage;
    private NewTodoPage(){}

    public static NewTodoPage getInstance(){
        if (newTodoPage == null){
            newTodoPage = new NewTodoPage();
        }
        return newTodoPage;
    }

    public void createNewTodo(WebDriver driver){
        driver.findElement(todoItemInput).sendKeys("Be Happy!");
        driver.findElement(createTodoButton).click();
    }

    public void createNewTodoUsingApi(WebDriver driver, User user, String item){
        TodoApi.getInstance().addTodo(user, item);
        TodoPage.getInstance().loadTodoPage(driver);
    }

}
