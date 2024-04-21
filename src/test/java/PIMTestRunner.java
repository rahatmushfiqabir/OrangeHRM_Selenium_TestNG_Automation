import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PIMTestRunner extends Setup {
    LoginPage loginPage;
    @BeforeTest
    public void doLogin () {
        loginPage = new LoginPage(driver);
        loginPage.doLogin("admin", "admin123");
    }

    @Test
    public void employeeeRegistration() throws InterruptedException {
        PIMPage pimPage = new PIMPage(driver);
        String firstName = "Rahat";
        String middleName = "Mushfiq";
        String lastName = "Abir";
        String userID= "96";
        String userName="rahatmushfiq67";
        String password="test123";
        String confirmPassword="test123";

        pimPage.registeUser(firstName,middleName,lastName,userID,userName,password,confirmPassword);
//        Utils.doScroll(driver,0,300);
//        Thread.sleep(500);

    }
}
