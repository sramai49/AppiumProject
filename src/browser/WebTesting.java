package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebTesting {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(MobileCapabilityType.NO_RESET, false);
		cap.setCapability("uiautomator2ServerLaunchTimeout", 600000);
		cap.setCapability("adbExecTimeout", 600000);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.khanacademy.android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
		
		//cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\SandhyaRamaiah\\Desktop\\Sandhya\\Automation\\Selenium-Prathap\\chromedriver_win32\\chromedriver.exe");
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign in\")")).click();
		driver.findElement(MobileBy.AccessibilityId("Continue with Facebook")).click();
		Thread.sleep(5000);
		//System.out.println(driver.getContextHandles());
		//driver.context(driver.getContextHandles().toArray()[1].toString());
		//driver.context("WEBVIEW_chrome");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"English (UK)\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"m_login_email\")")).sendKeys("sandhyadrs14@gmail.com");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"m_login_password\")")).sendKeys("welcome123");
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Log In\")")).click();
		//driver.get("https://magento.com");
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		
		
		
	}

}
