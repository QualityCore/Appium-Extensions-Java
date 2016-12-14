package com.github.qualitycore.appium.extensions.capabilities.contracts;

import java.io.Serializable;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.github.qualitycore.appium.extensions.capabilities.enums.AutomationNameEnum;
import com.github.qualitycore.appium.extensions.capabilities.enums.BrowserNameEnum;
import com.github.qualitycore.appium.extensions.capabilities.enums.PlatformNameEnum;
import com.github.qualitycore.appium.extensions.capabilities.enums.OrientationEnum;

import io.appium.java_client.remote.MobileCapabilityType;

public interface IAppiumServerCapabilities extends MobileCapabilityType, Serializable, Cloneable {

	public static AutomationNameEnum	DEFAULT_AUTOMATION_NAME		= AutomationNameEnum.APPIUM;
	public static PlatformNameEnum		DEFAULT_PLATFORM_NAME		= null;
	public static String				DEFAULT_PLATFORM_VERSION	= null;
	public static String				DEFAULT_DEVICE_NAME			= null;
	public static String				DEFAULT_APP					= null;
	public static BrowserNameEnum		DEFAULT_BROWSER_NAME		= null;
	public static long					DEFAULT_NEW_COMMAND_TIMEOUT	= 60L;
	public static String				DEFAULT_LANGUAGE			= null;
	public static String				DEFAULT_LOCALE				= null;
	public static String				DEFAULT_UDID				= null;
	public static OrientationEnum		DEFAULT_ORIENTATION			= null;
	public static boolean				DEFAULT_AUTO_WEBVIEW		= false;
	public static boolean				DEFAULT_NO_RESET			= false;
	public static boolean				DEFAULT_FULL_RESET			= false;

	public static String				AUTOMATION_NAME				= "automationName";
	public static String				PLATFORM_NAME				= "platformName";
	public static String				PLATFORM_VERSION			= "platformVersion";
	public static String				DEVICE_NAME					= "deviceName";
	public static String				APP							= "app";
	public static String				BROWSER_NAME				= "browserName";
	public static String				NEW_COMMAND_TIMEOUT			= "newCommandTimeout";
	public static String				LANGUAGE					= "language";
	public static String				LOCALE						= "locale";
	public static String				UDID						= "udid";
	public static String				ORIENTATION					= "orientation";
	public static String				AUTO_WEBVIEW				= "autoWebview";
	public static String				NO_RESET					= "noReset";
	public static String				FULL_RESET					= "fullReset";

	public DesiredCapabilities toDesiredCapabilities();

	public AutomationNameEnum getAutomationName();

	public void setAutomationName(AutomationNameEnum automationName);

	public PlatformNameEnum getPlatformName();

	public void setPlatformName(PlatformNameEnum platformName);

	public String getPlatformVersion();

	public void setPlatformVersion(String platformVersion);

	public String getDeviceName();

	public void setDeviceName(String deviceName);

	public String getApp();

	public void setApp(String app);

	public BrowserNameEnum getBrowserName();

	public void setBrowserName(BrowserNameEnum browserName);

	public long getNewCommandTimeout();

	public void setNewCommandTimeout(long newCommandTimeout);

	public String getLanguage();

	public void setLanguage(String language);

	public String getLocale();

	public void setLocale(String locale);

	public String getUdid();

	public void setUdid(String udid);

	public OrientationEnum getOrientation();

	public void setOrientation(OrientationEnum orientation);

	public boolean isAutoWebview();

	public void setAutoWebview(boolean autoWebview);

	public boolean isNoReset();

	public void setNoReset(boolean noReset);

	public boolean isFullReset();

	public void setFullReset(boolean fullReset);

	public IAppiumServerCapabilities clone();

}
