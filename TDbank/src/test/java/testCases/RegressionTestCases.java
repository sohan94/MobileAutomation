package testCases;

import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;

public class RegressionTestCases extends MobileAPI2 {
    HomePage homePage;
    AccountPage accountPage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
        accountPage = PageFactory.initElements(appiumDriver, AccountPage.class);
    }

    @Test
    public void testAccountFunctionallity() {
        homePage.clickAccount();
        accountPage.sendKeyAccount();
    }
}
