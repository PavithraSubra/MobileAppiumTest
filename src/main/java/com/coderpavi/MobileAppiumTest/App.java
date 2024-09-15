package com.coderpavi.MobileAppiumTest;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class App 
{
	static AndroidDriver driver ;
	 
	
	
    public static void main( String[] args ) throws MalformedURLException 
    {
   
        System.out.println( "Init config" );
        UiAutomator2Options caps = new UiAutomator2Options();
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("deviceName", "5587cee2"); // Replace with your device name
	        caps.setCapability("automationName", "UiAutomator2"); // Use UiAutomator2
	        
	        caps.setCapability("platformName", "Android");
	        caps.setCapability("platformVersion", "6");
	        
	        caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
	        caps.setCapability(CapabilityType.BROWSER_VERSION, "12");

	        caps.setCapability("AndroidMobileCapabilityType.APP_ACTIVITY", "com.google.android.apps.chrome.Main");

	      caps.setCapability("autoDownload", true);
	      URL url = new URL("http://127.0.0.1:4723/");
	        driver = new AndroidDriver(url, caps);
	       
	        //RemoteWebDriver driver = new RemoteWebDriver(appiumServerUrl, caps);

	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.get("https://www.prismcloudinc.com/services");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        System.out.println("Web application started");
	        // Perform actions on the web page
	        // ...
	        
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"We create digital solutions.\")")).isDisplayed();
	      
	        clear();

		
    }
    public static void clear() {
        System.out.println("Quitting driver");

    	driver.quit();
    }
}
