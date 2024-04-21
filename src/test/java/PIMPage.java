import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMPage {
    @FindBy(className="oxd-main-menu-item")
    List<WebElement> menuItems;

    @FindBy(className = "oxd-button")
    List<WebElement> button;

    @FindBy(className = "oxd-input")
    List<WebElement> inputField;

    @FindBy(className = "oxd-switch-input")
    WebElement toggleButton;

    public PIMPage(WebDriver  driver){
        PageFactory.initElements(driver, this);
    }

    public void registeUser(String firstName,String middleName, String lastName,String userId, String userName, String password, String confimrPassword ){
        menuItems.get(1).click(); //Click on PIM page
        button.get(2).click();// Click on add button
        toggleButton.click();

        inputField.get(1).sendKeys(firstName);
        inputField.get(2).sendKeys(middleName);
        inputField.get(3).sendKeys(lastName);
        inputField.get(4).sendKeys(userId);
        inputField.get(5).sendKeys(userName);
        inputField.get(6).sendKeys(password);
        inputField.get(7).sendKeys(confimrPassword);
        button.get(1).click(); //click on save button

    }
}


