package com.qa.demoqa.pages;

import com.qa.demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WebTables extends BasePage {


    By textHeader = By.className("main-header");
    By buttonAdd = By.id("addNewRecordButton");

    //Registration Form
    By labelFirstName = By.id("firstName");
    By labelLastName = By.id("lastName");
    By labelEmail = By.id("userEmail");
    By labelAge = By.id("age");
    By labelSalary = By.id("salary");
    By labelDepartment = By.id("department");
    By btnSubmit = By.id("submit");

    //Assert
    By assertFirstName = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]");
    By assertLastName = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[2]");
    By assertAge = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[3]");
    By assertEmail = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[4]");
    By assertSalary = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[5]");
    By assertDepartment = By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[6]");

    //Action
    By buttonDelete = By.id("delete-record-4");
    By buttonEdit = By.id("edit-record-4");

    public WebTables(WebDriver driver) {
        super(driver);
    }

    public String getHeaderWebTable(){
        return getText(textHeader);
    }

    public void intoFormRegistration(){
        clickOn(buttonAdd);
    }

    public void clearFormRegistration(){
        clearText(labelFirstName);
        clearText(labelLastName);
        clearText(labelEmail);
        clearText(labelAge);
        clearText(labelSalary);
        clearText(labelDepartment);
    }

    public void fillForm(){
        typeInto(labelFirstName, "David");
        typeInto(labelLastName, "Salvador");
        typeInto(labelEmail, "salva@email.com");
        typeInto(labelAge, "30");
        typeInto(labelSalary, "50000");
        typeInto(labelDepartment, "Tech");
        clickOn(btnSubmit);
    }

    public void 

    public List<String> registrationDone(){
        List<String> submittedFormResult = new ArrayList<>();
        submittedFormResult.add(getText(assertFirstName).trim());
        submittedFormResult.add(getText(assertLastName).trim());
        submittedFormResult.add(getText(assertAge).trim());
        submittedFormResult.add(getText(assertEmail).trim());
        submittedFormResult.add(getText(assertSalary).trim());
        submittedFormResult.add(getText(assertDepartment).trim());
        return submittedFormResult;
    }

    public List<String> expected(){
        List<String> submitedFormResult = new ArrayList<String>();
        submitedFormResult.add("David");
        submitedFormResult.add("Salvador");
        submitedFormResult.add("30");
        submitedFormResult.add("salva@email.com");
        submitedFormResult.add("50000");
        submitedFormResult.add("Tech");
        return submitedFormResult;
    }

}
