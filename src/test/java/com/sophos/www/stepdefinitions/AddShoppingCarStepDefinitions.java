package com.sophos.www.stepdefinitions;

import com.sophos.www.tasks.SearchProduct;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddShoppingCarStepDefinitions {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp(){

        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Actor").can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^I enter into vivanda page$")
    public void iEnterIntoVivandaPage() {
        theActorInTheSpotlight()
                .wasAbleTo(Open.url("https://www.vivanda.com.pe/"));


    }

    @When("^I add a product (.*) into shopping car$")
    public void iAddAProductVinoIntoShoppingCar(String product) {
        //buscar producto
        theActorInTheSpotlight().attemptsTo(SearchProduct.inTheVirtualShop(product));
        //añadir al carrito

    }

    @Then("^I verify that the product selected is in the shopping car$")
    public void iVerifyThatTheProductSelectedIsInTheShoppingCar() {
//Verificar que haya sido a
    }

}
