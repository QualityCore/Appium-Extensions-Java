package com.github.qualitycore.appium.extensions.capabilities.enums;

import io.appium.java_client.remote.MobileBrowserType;

public enum BrowserNameEnum {

	SAFARI(MobileBrowserType.SAFARI),
	BROWSER(MobileBrowserType.BROWSER),
	CHROMIUM(MobileBrowserType.CHROMIUM),
	CHROME(MobileBrowserType.CHROME);

	private final String value;

	private BrowserNameEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return this.getValue();
	}
	
}
