package com.github.qualitycore.appium.extensions.capabilities.enums;

import io.appium.java_client.remote.AutomationName;

public enum AutomationNameEnum {

	APPIUM(AutomationName.APPIUM),
	SELENDROID(AutomationName.SELENDROID);

	private final String value;

	private AutomationNameEnum(String value) {
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
