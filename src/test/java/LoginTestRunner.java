import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestRunner extends Setup  {
    @Test
    public void doLogin () {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("admin", "admin123");
       WebElement imgProfile = driver.findElement(By.className("oxd-userdropdown-img"));
        Assert.assertTrue(imgProfile.isDisplayed());
    }
}
