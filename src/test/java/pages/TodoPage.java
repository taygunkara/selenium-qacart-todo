package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigUtils;

public class TodoPage {

    private final static By plusIcon = By.cssSelector("[data-testid=\"add\"]");
    private final static By deleteIcon = By.cssSelector("[data-testid=\"delete\"]");
    private final static By welcomeDisplay = By.cssSelector("[data-testid=\"welcome\"]");
    private final static By todoDisplay = By.cssSelector("[data-testid=\"todo-text\"]");
    private final static By noTodosDisplay = By.cssSelector("[data-testid=\"no-todos\"]");

    private static TodoPage todoPage;
    private TodoPage(){}

    public static TodoPage getInstance(){
        if (todoPage == null){
            todoPage = new TodoPage();
        }
        return todoPage;
    }

    public void loadTodoPage(WebDriver driver){
        driver.get(ConfigUtils.getInstance().getBaseURL() + "/todo");
    }

    public void clickPlusIcon(WebDriver driver){
        driver.findElement(plusIcon).click();
    }

    public void clickDeleteIcon(WebDriver driver){
        driver.findElement(deleteIcon).click();
    }

    public boolean isWelcomeDisplayed(WebDriver driver){
        return driver.findElement(welcomeDisplay).isDisplayed();
    }

    public boolean isTodoDisplayed(WebDriver driver){
        return driver.findElement(todoDisplay).isDisplayed();
    }

    public boolean isNoTodosDisplayed(WebDriver driver){
        return driver.findElement(noTodosDisplay).isDisplayed();
    }

}
