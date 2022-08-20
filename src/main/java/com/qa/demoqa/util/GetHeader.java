package com.qa.demoqa.util;

public enum GetHeader {
    HEADER_ELEMENT("Elements"),
    HEADER_WEB_TABLE("Web Tables"),
    HEADER_DATE_PICKER("Date Picker"),
    HEADER_WIDGETS("Widgets");

    private final String value;

    public String getValue() {
        return value;
    }

    GetHeader(String value) {
        this.value = value;
    }
}
