package com.swag.definitions;

import com.swag.steps.login.LoginStep;
import com.swag.steps.validations.ValidationStep;
import com.swag.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;
@Given("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.navigateTo("https://www.saucedemo.com/v1/index.html");
    }

    @When("Ingresa credenciales validas")
    public void userLoginWithValidateCredentials(){
        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.clickLogin();
    }

    @Then("la aplicacion deberia mostrar el modulo principal de productos")
    public void systemShowProductModule(){
        Assert.assertTrue(validate.tittleIsVisible());
    }


    //Segundo escenario

    @When("Ingresa credenciales invalidas")
    public void userLoginWithInvalidateCredentials(){
        login.typeUsername("standard_user");
        login.typePassword("12345");
        login.clickLogin();
    }


    @Then("La aplicacion deberia mostrar un mensaje de error")
    public void systemShowErrorMessage(){
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
