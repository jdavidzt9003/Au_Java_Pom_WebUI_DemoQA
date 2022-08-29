package com.qa.demoqa.pages;

import com.qa.demoqa.pages.base.BasePage;
import com.qa.demoqa.util.AlertMessage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage extends BasePage {

    private final String NAME = "David Zaraza";
    By alertButton = By.id("alertButton");
    By timerAlertButton = By.id("timerAlertButton");
    By confirmButton = By.id("confirmButton");
    By promptButton = By.id("promtButton");

    By messageConfirm = By.id("confirmResult");
    By messagePrompt = By.id("promptResult");

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertButton(){
        clickOn(alertButton);
        alertsAccept();
    }

    public void openTimerAlertButton(){
        clickOn(timerAlertButton);
        waitExplicitAlert();
        alertsAccept();
    }

    public void openConfirmButtonAccept() {
        clickOn(confirmButton);
        alertsAccept();
    }

    public void openConfirmButtonDismiss() {
        clickOn(confirmButton);
        alertsDismiss();
    }

    public void openPromptAlert(){
        clickOn(promptButton);
        alertsSendKeys(NAME);
        alertsAccept();
    }

    public String messageConfirm() {
        return getText(messageConfirm);
    }

    public String messagePrompt() {
        return getText(messagePrompt);
    }

    public String comparePrompt() {
       String message = AlertMessage.CONFIRM_PROMPT.getValue();
       return message + NAME;
    }
}
