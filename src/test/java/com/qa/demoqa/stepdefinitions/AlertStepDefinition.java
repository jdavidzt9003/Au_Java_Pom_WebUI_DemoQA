package com.qa.demoqa.stepdefinitions;

import com.qa.demoqa.pages.AlertWindowPage;
import com.qa.demoqa.pages.HomePage;
import com.qa.demoqa.pages.AlertPage;
import com.qa.demoqa.util.AlertMessage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertStepDefinition {

    public WebDriver driver;
    HomePage homePage;
    AlertPage alertPage;
    AlertWindowPage alertWindowPage;

    @Given("que el usuario se encuentra en la página de alerts")
    public void queElUsuarioSeEncuentraEnLaPaginaDeAlerts() {
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
            homePage.openAlerts();
            alertWindowPage = new AlertWindowPage(driver);
            alertWindowPage.openAlert();
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("Un error ha ocurrido intentanto acceder a Alerts");
        }
    }

    @When("el usuario interactua con los cuatro tipos de alertas disponibles")
    public void elUsuarioInteractuaConLosCuatroTiposDeAlertasDisponibles() {
        try {
            alertPage = new AlertPage(driver);
            alertPage.openAlertButton();
            alertPage.openTimerAlertButton();
            alertPage.openConfirmButtonAccept();
            Assertions.assertEquals(AlertMessage.CONFIRM_OK.getValue(),alertPage.messageConfirm());
            alertPage.openConfirmButtonDismiss();
            Assertions.assertEquals(AlertMessage.CONFIRM_CANCEL.getValue(),alertPage.messageConfirm());
            alertPage.openPromptAlert();
            Thread.sleep(5000);
            Assertions.assertEquals(alertPage.comparePrompt(), alertPage.messagePrompt());
        } catch (Exception e) {
            System.out.println("Error en la ejecución de alertas");
        }
    }

    @Then("abrirá y cerrará correctamente cada alerta")
    public void abriraYCerraraCorrectamenteCadaAlerta() {
        alertPage = new AlertPage(driver);
        driver.quit();
    }
}
