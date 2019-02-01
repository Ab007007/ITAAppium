package com.ita.appium.basics;

import java.util.List;

import org.testng.annotations.Test;

import com.ita.appium.utils.AndroidUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidUIAutomatorDemo extends AndroidUtils
{

	AndroidDriver<AndroidElement> driver = null;
	@Test
	public void viewsFlowTest()
	{
		driver = getMyAppiumDriver(appName, deviceName);
		
		/**
		 * syntax
		 * ======
		 * "attribute("value")"
		 */
		List<AndroidElement> value = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)");
		
		System.out.println("total clickable items on screen " + value.size());
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
	}
	
}
