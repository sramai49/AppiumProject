package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Udemy {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName","abc");
		cap.setCapability("platformName", "Android");
		//cap.setCapability("udid","emulator-5554");
		cap.setCapability("appPackage","com.udemy.android");
		cap.setCapability("appActivity","com.udemy.android.SplashActivity");
		cap.setCapability("uiautomator2ServerLaunchTimeout", 600000);
		cap.setCapability("adbExecTimeout", 600000);
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(MobileBy.id("com.udemy.android:id/browse_button")).click();
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		driver.findElement(MobileBy.id("com.udemy.android:id/search_bar_text")).click();
		driver.findElement(MobileBy.id("com.udemy.android:id/search_bar_text")).sendKeys("selenium");
		driver.hideKeyboard();

	}

}
