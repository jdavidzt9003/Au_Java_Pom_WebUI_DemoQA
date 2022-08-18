package com.qa.demoqa.stepdefinitions;

import com.qa.demoqa.pages.ElementPage;
import com.qa.demoqa.pages.HomePage;
import com.qa.demoqa.pages.WebTables;
import com.qa.demoqa.util.GetHeader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class WebTableStepDefinition {

    public WebDriver driver;
    HomePage homePage;
    ElementPage elementPage;
    WebTables webTables;

    @Given("que el usuario se encuentra en la página de web tables")
    public void queElUsuarioSeEncuentraEnLaPáginaDeWebTables() throws InterruptedException {
        try {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome/chromedriver");
            driver = new ChromeDriver();
            driver.get("https://demoqa.com");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error con el driver");
        }
        try {
            homePage = new HomePage(driver);
            homePage.openElements();
            elementPage = new ElementPage(driver);
            Assertions.assertEquals(GetHeader.HEADER_ELEMENT.getValue(),elementPage.getHeader());
            Thread.sleep(3000);
            elementPage.openWebTableOption();
            webTables = new WebTables(driver);
            Assertions.assertEquals(GetHeader.HEADER_WEB_TABLE.getValue(), webTables.getHeaderWebTable());

        } catch (Exception e) {
            System.out.println("Un error ha ocurrido intentanto acceder a web table");
        }
    }

    @When("el usuario diligencia todos los campos del formulario de registro")
    public void elUsuarioDiligenciaTodosLosCamposDelFormularioDeRegistro() throws InterruptedException {
        webTables = new WebTables(driver);
        webTables.intoFormRegistration();
        webTables.clearFormRegistration();
        webTables.fillForm();
        Thread.sleep(3000);
    }

    @Then("los datos se almacenarán correctamente en la tabla")
    public void losDatosSeAlmacenaránCorrectamenteEnLaTabla() throws InterruptedException {
        webTables = new WebTables(driver);
        Assertions.assertEquals(webTables.registrationDone(),webTables.expected());
        Thread.sleep(3000);
        driver.quit();
    }

    @When("el usuario da click en el boton eliminar")
    public void elUsuarioDaClickEnElBotonEliminar() {
        webTables = new WebTables(driver);
    }

    @Then("el registro seleccionado se elimina correctamente de la tabla")
    public void elRegistroSeleccionadoSeEliminaCorrectamenteDeLaTabla() {
        driver.quit();

    }

}
