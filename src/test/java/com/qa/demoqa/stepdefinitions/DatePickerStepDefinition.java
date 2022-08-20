package com.qa.demoqa.stepdefinitions;

import com.qa.demoqa.pages.*;
import com.qa.demoqa.util.GetHeader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerStepDefinition {

    public WebDriver driver;
    public DatePickerPage datePickerPage;

    @Given("que el usuario se encuentra en la página de date picker")
    public void queElUsuarioSeEncuentraEnLaPaginaDeDatePicker() {
        try {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com/date-picker");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error con el driver");
        }
        try {
            datePickerPage = new DatePickerPage(driver);
            Assertions.assertEquals(GetHeader.HEADER_DATE_PICKER.getValue(), datePickerPage.getHeader());
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Un error ha ocurrido intentanto acceder a Date Picker");
        }
    }

    @When("el usuario selecciona la opción de Data And Time")
    public void elUsuarioSeleccionaLaOpcionDeDataAndTime() {
        try {
            datePickerPage = new DatePickerPage(driver);
            datePickerPage.selectDate();
        } catch (Exception e) {
            System.out.println("Error en la selección de fecha");
        }
    }

    @Then("seleccionará un fecha")
    public void seleccionaraUnFecha() {
        try {
            datePickerPage = new DatePickerPage(driver);
            Assertions.assertEquals(datePickerPage.dateExpected(), datePickerPage.getDate());
            Thread.sleep(5000);
            driver.quit();
        } catch (Exception e) {
            System.out.println("Error comparando datos");
        }
    }
}
