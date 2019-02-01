package com.ita.appium.touchactions;

import org.testng.annotations.Test;

import com.ita.appium.utils.AndroidUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;

public class TapDemo extends AndroidUtils{

	AndroidDriver<AndroidElement> driver = null;
	
	@Test
	public void scrollTestToElement()
	{
		driver = getMyAppiumDriver(appName, deviceName);
		
		TouchAction act = new TouchAction<>(driver);
		
		act.tap(ElementOption.element(driver.findElementByAndroidUIAutomator("text(\"Views\")"))).perform();
		//"attribute("value")"
//		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
//		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
	
	}
}
