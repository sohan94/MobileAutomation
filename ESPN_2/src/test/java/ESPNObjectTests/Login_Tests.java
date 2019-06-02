package ESPNObjectTests;


import ESPNObjectPage.Login;
import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Tests extends MobileAPI2 {

    Login obj;

    @BeforeMethod
    public void initiateDriver()
    {
        obj = PageFactory.initElements(appiumDriver,Login.class);
    }

    @Test
    public void AllowbuttoTest() throws InterruptedException {
        obj.AllowButton();
    }


}
