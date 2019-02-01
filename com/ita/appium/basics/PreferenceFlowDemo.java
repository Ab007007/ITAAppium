package com.ita.appium.basics;

import org.testng.annotations.Test;

import com.ita.appium.utils.AndroidUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class PreferenceFlowDemo extends AndroidUtils
{
	AndroidDriver<AndroidElement> driver =null;
	
	@Test
	public void selectWifiSettingsTest() throws InterruptedException
	{
		System.out.println("Creating a driver and launching application...");
		driver =  getMyAppiumDriver("app//ApiDemos-debug.apk", "Pixel");
		
		System.out.println("Application launched successfully on device");
		//tagname[@pn='pv']
		
		System.out.println("clicking on Preference");
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		System.out.println("clicking on Preference dependencies");
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		System.out.println("Validate checkbox is selected or not...");
		if(!(driver.findElementById("android:id/checkbox").isSelected()))
		{
			System.out.println("check box is not selected...clicking on checkbox");
			driver.findElementById("android:id/checkbox").click();
		}
		else
		{
			System.out.println("Check box is already selected...");
		}
		
	//	driver.findElementByXPath("//android.widget.RelativeLayout[android.widget.TextView[@text='WiFi settings']]").click();
	//	or
	//	driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
	//	or
		System.out.println("Clicking on Wifi Settings");
		driver.findElementsByXPath("//android.widget.RelativeLayout").get(1).click();
		
		System.out.println("Entering data on TextBox");
		driver.findElementById("android:id/edit").sendKeys("VirusHere");
		
		System.out.println("Clicking on OK Button");
		System.out.println(driver.findElementById("android:id/button1").getAttribute("text"));
		driver.findElementById("android:id/button1").click();
		
		System.out.println("Test Ended Successfully...");
		
	}
}
