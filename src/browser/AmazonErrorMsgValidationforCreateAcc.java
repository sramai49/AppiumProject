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

public class AmazonErrorMsgValidationforCreateAcc {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName","abc");
		cap.setCapability("platformName", "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(MobileCapabilityType.NO_RESET, false);
		cap.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
		cap.setCapability("uiautomator2ServerLaunchTimeout", 600000);
		cap.setCapability("adbExecTimeout", 600000);
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click(); 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(text(),'Hello, Sign in')]")).click();		
		driver.findElement(By.xpath("//*[@id='register_accordion_header']")).click();	
		driver.findElement(By.xpath("//*[@id='ap_customer_name']")).sendKeys("sandhya");
		driver.findElement(By.xpath("//*[@id='ap_phone_number']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("sandhya.ramaiah@gmail.com");
		driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("welcome1234");
		driver.findElement(By.xpath("//*[@id='continue']")).click();
		String Message=driver.findElement(By.xpath("//*[contains(text(),'Mobile number already in use')]")).getText();
		//"Mobile number already in use"
		System.out.println(Message);
		
	}

}
