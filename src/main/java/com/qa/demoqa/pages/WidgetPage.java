package com.qa.demoqa.pages;

import com.qa.demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WidgetPage extends BasePage {

    By titlePage = By.className("main-header");

    public WidgetPage(WebDriver driver) {
        super(driver);
    }

    public String getHeader(){
        return getText(titlePage);
    }
}
