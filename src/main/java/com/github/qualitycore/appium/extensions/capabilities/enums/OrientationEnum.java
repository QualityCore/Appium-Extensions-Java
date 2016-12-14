package com.github.qualitycore.appium.extensions.capabilities.enums;

public enum OrientationEnum {

	LANDSCAPE("LANDSCAPE"),
	PORTRAIT("PORTRAIT");

	private final String value;

	private OrientationEnum(String value) {
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
