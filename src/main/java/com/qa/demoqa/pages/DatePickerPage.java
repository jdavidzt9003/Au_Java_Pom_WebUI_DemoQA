package com.qa.demoqa.pages;

import com.qa.demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerPage extends BasePage {

    By headerPage = By.className("main-header");
    By dataSelectDate = By.id("datePickerMonthYearInput");
    By selectMonth = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/span[1]");
    By selectYear = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[1]");
    By year = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div[1]/div[6]");
    By month = By.xpath("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[1]/div[9]");
    By day = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]");
    By time = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/div/ul/li[85]");
    By dateDateTime = By.id("dateAndTimePickerInput");


    public DatePickerPage(WebDriver driver) {
        super(driver);
    }


    public String getHeader(){
        return getText(headerPage);
    }

    public void selectDate(){
        clickOn(dateDateTime);
        clearText(dateDateTime);
        clickOn(selectMonth);
        clickOn(month);
        clickOn(selectYear);
        clickOn(year);
        clickOn(day);
        clickOn(time);
    }

    public String dateExpected(){
        String date = "September 11, 2023 9:00 PM";
        return date;
    }
    public String getDate(){
        return getValue(dateDateTime);
    }

}
