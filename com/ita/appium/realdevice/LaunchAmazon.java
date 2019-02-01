package com.ita.appium.realdevice;

import org.testng.annotations.Test;

import com.ita.appium.utils.AndroidUtils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LaunchAmazon extends AndroidUtils{
AndroidDriver<AndroidElement> driver = null;
	
	@Test
	public void LaunchAmazonTest()
	{
		driver = getMyAppiumDriver("app//Gaana.apk", "Android device");
		
		
	}
}
