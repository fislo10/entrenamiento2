package com.sophos.www.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/add_shopping_car.feature",
        snippets = SnippetType.CAMELCASE,
        dryRun = false ,
        glue = "com.sophos.www.stepdefinitions")
public class AddShoppingCar {
}
