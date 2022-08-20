package com.qa.demoqa.pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    private final WebDriver driver;

    public BasePage(WebDriver driver) {
            this.driver = driver;
    }

    public void clickOn(By locator){
        driver.findElement(locator).click();
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public String getValue(By locator){
        return driver.findElement(locator).getAttribute("value");
    }

    public void typeInto(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }

    public void clearText(By locator){
        driver.findElement(locator).clear();
    }

    public void alertsAccept(){
        driver.switchTo().alert().accept();
    }
    public void alertsDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void alertsSendKeys(String keys){
        driver.switchTo().alert().sendKeys(keys);
    }
    public void alertsGetText(){
        driver.switchTo().alert().getText();
    }
}
