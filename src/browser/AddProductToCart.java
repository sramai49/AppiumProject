package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AddProductToCart {

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
		driver.findElement(By.xpath("//input[contains(@class,'nav-input')]")).sendKeys("iphone 7");
//		driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
//		driver.findElement(By.xpath("//span[contains(@class,'a-size-base a-color-base a-text-normal')]")).click();
		
		driver.findElement(By.xpath("//input[@class='nav-input']")).click();
		driver.findElement(By.xpath("//*[@id=\"issDiv0\"]/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/span[3]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"color_name-button\"]/span/input")).click();		
		driver.findElement(By.xpath("//*[@id=\"color_name_1\"]/span/input")).click();
     	driver.findElement(By.xpath("//span[@class='a-sheet-close a-focus-hidden']")).click(); 
     	driver.findElement(By.xpath("//*[@id=\"a-autoid-13-announce\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"mobileQuantityDropDown_4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-submit\"]")).click();
		
		
	}

}
