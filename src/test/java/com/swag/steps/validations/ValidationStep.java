package com.swag.steps.validations;

import com.swag.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {


    @Step("Validar visualizacion del modulo de productos")
    public Boolean tittleIsVisible(){
        return lbl_product.isDisplayed();
    }

    @Step("Validar visualizacion del mensaje de error")
    public Boolean errorMessageIsDisplayed(){
        return lbl_errorMessage.isDisplayed();
    }

}
