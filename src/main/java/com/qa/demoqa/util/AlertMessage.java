package com.qa.demoqa.util;

public enum AlertMessage {

    CLICK_BUTTON  ("You clicked a button"),
    AFTER_FIVE_CLICK  ("This alert appeared after 5 seconds"),
    CONFIRM_BOX ("Do you confirm action?"),
    PROMPT_BOX ("Please enter your name"),
    CONFIRM_OK ("You selected Ok"),
    CONFIRM_CANCEL("You selected Cancel"),
    CONFIRM_PROMPT("You entered ");
    private final String value;

    public String getValue(){
        return value;
    }

    AlertMessage(String value) {
        this.value = value;
    }
}
