package com.qa.demoqa.pages;

import com.qa.demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePickerPage extends BasePage {

    By titlePage = By.className("main-header");
    By dataSelectDate = By.id("datePickerMonthYearInput");
    By dateDateTime = By.id("dateAndTimePickerInput");

    public DatePickerPage(WebDriver driver) {
        super(driver);
    }

    public String getHeader(){
        return getText(titlePage);
    }
    public void openDateTime() {
        clickOn(dateDateTime);
    }
}
