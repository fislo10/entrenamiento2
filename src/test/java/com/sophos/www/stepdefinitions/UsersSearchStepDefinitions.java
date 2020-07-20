package com.sophos.www.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.rest.abiities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.thucydides.core.util.EnvironmentVariables;

import javax.swing.*;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;

public class UsersSearchStepDefinitions {

    private String theRestApiBaseUrl;
    private EnvironmentVariables environmentVariables;
    private Actor sam;
    @Given("I got the service")
    public void iGotTheService() {

        /*
        cuando no funciona usando el archivo properties se puede solucionar facilmente con el orElse
        theRestApiBaseUrl = environmentVariables.optionalProperty("restapi.baseurl")
                                        .orElse("https://reqres.in/api");
        */

        theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl");
       // JOptionPane.showMessageDialog(null,theRestApiBaseUrl);
        //La CallAnApi capacidad les da a los actores la capacidad de interactuar con un servicio web REST

        theActorInTheSpotlight().whoCan(CallAnApi.at(theRestApiBaseUrl));
        sam = Actor.named("Sam the supervisor").whoCan(CallAnApi.at(theRestApiBaseUrl));
        //sam.attemptsTo(Get.resource("/users/1"));


       // JOptionPane.showMessageDialog(null,Get.resource("/users/1"));
    }

    @When("^I ask for the user id (\\d+)$")
    public void iAskForTheUserId(int arg1) {
        sam.attemptsTo(Get.resource("/users/1"));
    }


    @Then("^I should see that the first name is Bonita$")
    public void iShouldSeeThatTheFirstNameIsBonita() {
        sam.should(
                seeThatResponse( "User details should be correct",
                        response -> response.statusCode(200)
                                .body("data.first_name", equalTo("George"))
                                .body("data.last_name", equalTo("Bluth"))

                )
        );
    }
}
