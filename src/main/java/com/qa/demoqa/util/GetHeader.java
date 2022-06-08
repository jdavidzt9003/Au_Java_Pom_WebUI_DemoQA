package com.qa.demoqa.util;

public enum GetHeader {
    HEADER_ELEMENT("Elements"),
    HEADER_WEB_TABLE("Web Tables");

    private final String value;

    public String getValue() {
        return value;
    }

    GetHeader(String value) {
        this.value = value;
    }
}
