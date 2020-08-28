package app.bridgelabz.Pages;

import app.bridgelabz.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProfile extends BaseClass {
    public SearchProfile()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\'Search and Explore\']")
    WebElement SearchAndExplore;
    @FindBy(id = "com.instagram.android:id/action_bar_search_edit_text")
    WebElement SearchPerson;
    @FindBy(id = "com.android.permissioncontroller:id/permission_allow_always_button")
    WebElement Allow;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout")
    WebElement SelectUser;
    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"Video by Cristiano Ronaldo at Row 1, Column 1\"]")
    WebElement ChoosePost;
    @FindBy(id = "com.instagram.android:id/row_feed_photo_profile_name")
    WebElement UserID;
    @FindBy(id = "com.instagram.android:id/row_feed_button_like")
    WebElement hitLike;



    public String search() throws InterruptedException
    {
        Thread.sleep(2000);
        SearchAndExplore.click();
        Thread.sleep(2000);
        SearchPerson.click();
        Allow.click();
        Thread.sleep(2000);
        SearchPerson.sendKeys("Cristiano Ronaldo");
        Thread.sleep(5000);
        SelectUser.click();
        Thread.sleep(5000);
        ChoosePost.click();
        Thread.sleep(2000);
        hitLike.click();
        return UserID.getText();
    }
}