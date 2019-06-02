package ESPNObjectPage;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends MobileAPI2 {

    @FindBy (xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[2]\n")
    WebElement allow;

    public void AllowButton() throws InterruptedException {
        allow.click();
        Thread.sleep(3000);
    }


}
