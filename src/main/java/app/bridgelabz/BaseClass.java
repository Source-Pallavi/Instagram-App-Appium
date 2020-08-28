package app.bridgelabz;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass
{
   public static   AppiumDriver driver;
   public void driverMethod() throws MalformedURLException {
       DesiredCapabilities cap=new DesiredCapabilities();
       cap.setCapability("deviceName","Mi A3");
       cap.setCapability("udid","d471c6dc975f");
       cap.setCapability("platformName","Android");
       cap.setCapability("platformVersion","10");
       cap.setCapability("appPackage","com.instagram.android");
       cap.setCapability("appActivity","com.instagram.mainactivity.LaunchActivity");
       cap.setCapability("appActivity","com.instagram.mainactivity.MainActivity");
      // cap.setCapability("appActivity","com.instagram.nux.impl.OnboardingActivity");
       URL url= new URL("http://127.0.0.1:4723/wd/hub");
       driver=new AppiumDriver<MobileElement>(url,cap);

    }
}
