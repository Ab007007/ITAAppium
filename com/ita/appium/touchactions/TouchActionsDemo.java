package com.ita.appium.touchactions;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.ita.appium.utils.AndroidUtils;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class TouchActionsDemo extends AndroidUtils{

	
	@Test
	public void tapActionDemo()
	{
		AndroidDriver<AndroidElement> driver = getMyAppiumDriver(appName, deviceName);
		
		waitAndClick(driver, driver.findElementByAndroidUIAutomator("text(\"Views\")"));
		waitAndClick(driver, driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")"));
		
		AndroidElement sourceEle = driver.findElementByXPath("//android.view.View[@index='1']");
		AndroidElement destEle = driver.findElementByXPath("//android.view.View[@index='2']");
		
		TouchAction act = new TouchAction(driver);
		
		act.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(sourceEle))
		.withDuration(Duration.ofSeconds(3))).moveTo(ElementOption.element(destEle))
		.release().perform();
				
				
	}
	
	
}
