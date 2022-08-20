package com.qa.demoqa.pages;

import com.qa.demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertWindowPage extends BasePage {

    By optionAlert = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]");

    public AlertWindowPage(WebDriver driver) {
        super(driver);
    }

    public void openAlert(){
        clickOn(optionAlert);
    }
}
