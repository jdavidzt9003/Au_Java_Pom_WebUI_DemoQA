package com.qa.demoqa.pages;

import com.qa.demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementPage extends BasePage {

    By optionWebTable = By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[4]/span");
    By textHeader = By.className("main-header");

    public ElementPage(WebDriver driver) {
        super(driver);
    }

    public void openWebTableOption() {
        clickOn(optionWebTable);
    }

    public String getHeader() {
        return getText(textHeader);
    }
}
