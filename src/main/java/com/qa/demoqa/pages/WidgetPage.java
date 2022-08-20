package com.qa.demoqa.pages;

import com.qa.demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WidgetPage extends BasePage {

    By titlePage = By.className("main-header");
    By optionDataPicker = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[3]");

    public WidgetPage(WebDriver driver) {
        super(driver);
    }

    public String getHeader(){
        return getText(titlePage);
    }

    public void openDataPickerOption(){
        clickOn(optionDataPicker);
    }
}
