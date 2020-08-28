package app.bridgelabz.Pages;

import app.bridgelabz.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass
{
    public LoginPage()
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"_reine_pallavi_\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
    WebElement ChooseAccount;


    public void login() throws InterruptedException
    {
            Thread.sleep(2000);
            ChooseAccount.click();
            Thread.sleep(2000);
    }

}
