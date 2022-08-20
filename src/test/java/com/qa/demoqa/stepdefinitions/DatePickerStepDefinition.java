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
    public HomePage homePage;
    public WidgetPage widgetPage;
    public DatePickerPage datePickerPage;

    @Given("que el usuario se encuentra en la página de date picker")
    public void queElUsuarioSeEncuentraEnLaPaginaDeDatePicker() {
        try {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demoqa.com");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error con el driver");
        }
        try {
            homePage = new HomePage(driver);
            homePage.openWidgets();
            widgetPage = new WidgetPage(driver);
            Assertions.assertEquals(GetHeader.HEADER_WIDGETS.getValue(), widgetPage.getHeader());
            Thread.sleep(3000);
            widgetPage.openDataPickerOption();
            datePickerPage = new DatePickerPage(driver);
            Assertions.assertEquals(GetHeader.HEADER_DATE_PICKER.getValue(), datePickerPage.getHeader());

        } catch (Exception e) {
            System.out.println("Un error ha ocurrido intentanto acceder a Date Picker");
        }
    }

    @When("el usuario selecciona la opción de Data And Time")
    public void elUsuarioSeleccionaLaOpcionDeDataAndTime() {
        try {
            datePickerPage = new DatePickerPage(driver);
            datePickerPage.openDateTime();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Un error ha ocurrido con la fecha");
        }
    }
    @Then("seleccionará un fecha")
    public void seleccionaraUnFecha() {
        datePickerPage = new DatePickerPage(driver);
        driver.quit();
    }
}
