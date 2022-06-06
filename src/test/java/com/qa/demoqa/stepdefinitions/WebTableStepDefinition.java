package com.qa.demoqa.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebTableStepDefinition {

    public WebDriver driver;

    @Given("que el usuario se encuentra en la página de web tables")
    public void queElUsuarioSeEncuentraEnLaPáginaDeWebTables() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com");
        driver.findElement(By.name("q")).sendKeys("David" + Keys.ENTER);

        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath()));
    }

    @When("el usuario diligencia todos los campos del formulario de registro")
    public void elUsuarioDiligenciaTodosLosCamposDelFormularioDeRegistro() {

    }

    @Then("los datos se almacenarán correctamente en la tabla")
    public void losDatosSeAlmacenaránCorrectamenteEnLaTabla() {
        driver.quit();
    }

    @When("el usuario da click en el boton eliminar")
    public void elUsuarioDaClickEnElBotonEliminar() {

    }

    @Then("el registro seleccionado se elimina correctamente de la tabla")
    public void elRegistroSeleccionadoSeEliminaCorrectamenteDeLaTabla() {
        driver.quit();

    }

}
