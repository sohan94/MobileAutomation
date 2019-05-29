package pages;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI2 {

    @FindBy(xpath = "//android.widget.Button[@text='ACCOUNTS']")
    WebElement account;

    public void clickAccount() {
        account.click();
    }
}
