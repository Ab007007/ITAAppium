package com.ita.appium.operations;

import org.testng.annotations.Test;

import com.ita.appium.utils.AndroidUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class DriverOperations extends AndroidUtils {
	
	AndroidDriver<AndroidElement> driver = null;
	@Test 
	public void DriverOperations() throws InterruptedException
	{
		driver = getMyAppiumDriver(appName, deviceName);
		System.out.println(driver.currentActivity());
		System.out.println(driver.getContext());
		System.out.println(driver.getOrientation());
		System.out.println(driver.isDeviceLocked());
		System.out.println(driver.isKeyboardShown());
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		Thread.sleep(5000);
		
		
		
	}

}
