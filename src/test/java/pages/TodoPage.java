package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ConfigUtils;

public class TodoPage {

    private final static By plusIcon = By.className("[data-testid=\"add\"]");


    private static TodoPage todoPage;
    private TodoPage(){}

    public static TodoPage todoPage(){
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

}
