package com.qa.demoqa.pages;

import com.qa.demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By elements = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[1]/div/div[1]");
    private final By forms = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div/div[1]");
    private final By alertsFrameYWindows = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[3]/div/div[1]");
    private final By widgets = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[4]/div/div[1]");
    private final By interactions = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[5]/div/div[1]");
    private final By bookStoreApp = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[6]/div/div[1]");

    public void openElements() {
        clickOn(elements);
    }

}
