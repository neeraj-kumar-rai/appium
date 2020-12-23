package tests;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


import java.net.URL;
import java.util.concurrent.TimeUnit;

public class testing {

    static AppiumDriver<MobileElement> appium;

    @BeforeTest
    public static void Base()throws Exception{
        DesiredCapabilities d=new DesiredCapabilities();
        d.setCapability(MobileCapabilityType.PLATFORM_NAME,"ANDROID");
        d.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
        d.setCapability(MobileCapabilityType.UDID,"965a013c");
        d.setCapability(MobileCapabilityType.DEVICE_NAME,"Poco M2 Pro");
        d.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        appium =new AppiumDriver<MobileElement>(url,d);
        appium.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }



    @AfterTest
    public static void teardown(){
        appium.close();
        appium.quit();
    }

}
