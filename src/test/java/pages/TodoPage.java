package pages;

import io.qameta.allure.Step;
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

    @Step("Visiting the to do page")
    public void loadTodoPage(WebDriver driver){
        driver.get(ConfigUtils.getInstance().getBaseURL() + "/todo");
    }

    @Step("Click on the plus method")
    public void clickOnPlusIcon(WebDriver driver){
        driver.findElement(plusIcon).click();
    }

    @Step("Click on the delete icon")
    public void clickOnDeleteIcon(WebDriver driver){
        driver.findElement(deleteIcon).click();
    }

    @Step("Check if welcome message displayed")
    public boolean isWelcomeDisplayed(WebDriver driver){
        return driver.findElement(welcomeDisplay).isDisplayed();
    }

    @Step("Get the text of to do")
    public boolean isTodoDisplayed(WebDriver driver){
        return driver.findElement(todoDisplay).isDisplayed();
    }

    @Step("Check if no to do message is displayed")
    public boolean isNoTodosDisplayed(WebDriver driver){
        return driver.findElement(noTodosDisplay).isDisplayed();
    }

}
