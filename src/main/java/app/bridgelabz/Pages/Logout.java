package app.bridgelabz.Pages;

import app.bridgelabz.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends BaseClass {
    public Logout()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.instagram.android:id/tab_avatar")
    WebElement MyProfile;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Options\"]/android.widget.ImageView")
    WebElement ProSetting;
    @FindBy(id = "com.instagram.android:id/menu_settings_row")
    WebElement settings;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.ListView/android.widget.LinearLayout[3]")
    WebElement logOut;
    @FindBy(id = "com.instagram.android:id/button_positive")
    WebElement logOutButton;



    public void logout() throws InterruptedException {
        driver.navigate().back();
        MyProfile.click();
        Thread.sleep(2000);
        ProSetting.click();
        Thread.sleep(2000);
        settings.click();
        Thread.sleep(2000);
        logOut.click();
        Thread.sleep(2000);
        logOutButton.click();
        Thread.sleep(2000);

    }
}
