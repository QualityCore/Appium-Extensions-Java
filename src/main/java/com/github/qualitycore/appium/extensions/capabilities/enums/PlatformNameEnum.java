package com.github.qualitycore.appium.extensions.capabilities.enums;

import io.appium.java_client.remote.MobilePlatform;

public enum PlatformNameEnum {

	ANDROID(MobilePlatform.ANDROID),
	IOS(MobilePlatform.IOS),
	FIREFOX_OS(MobilePlatform.FIREFOX_OS);

	private final String value;

	private PlatformNameEnum(String value) {
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
