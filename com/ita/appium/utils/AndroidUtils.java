package com.ita.appium.utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidUtils {
	public static final String appName="app//ApiDemos-debug.apk";
	public static final String deviceName="Pixel";
	AndroidDriver<AndroidElement> driver = null;
	
	public AndroidDriver<AndroidElement> getMyAppiumDriver(String appName,String deviceName)
	{
		//"app//ApiDemos-debug.apk"
		File f = new File(appName);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		try 
		{
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		}
		catch (MalformedURLException e) 
		{
			System.out.println("Error while Creating Driver Object...");
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	
	
	public AndroidDriver<AndroidElement> getMyAppiumDriver(String packageName, String activityName,String deviceName)
	{
		//"app//ApiDemos-debug.apk"
		File f = new File(appName);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
		cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		try 
		{
			driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		}
		catch (MalformedURLException e) 
		{
			System.out.println("Error while Creating Driver Object...");
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
	public void waitAndClick(AndroidDriver driver,AndroidElement ele)
	{
		System.out.println("Waiting for the element to appear ....");
		WebDriverWait wait = new WebDriverWait(driver,20);
		AndroidElement element = (AndroidElement) wait.until(ExpectedConditions.visibilityOf(ele));
		System.out.println("performing click operation...");
		element.click();
	}
}
