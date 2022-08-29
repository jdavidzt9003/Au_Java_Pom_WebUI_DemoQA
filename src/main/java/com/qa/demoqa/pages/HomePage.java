package com.qa.demoqa.pages;

import com.qa.demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By elements = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[1]");
    private final By alertsFrameYWindows = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[3]/div/div[1]");

    public void openElements() {
        clickOn(elements);
    }


    public void openAlerts(){
        clickOn(alertsFrameYWindows);
    }
}