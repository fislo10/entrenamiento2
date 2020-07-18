package com.sophos.www.runners;


import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(monochrome=true,
        features = "src/test/resources/features/users_search.feature",
        glue = {"com.sophos.www.stepdefinitions"},
        snippets = CAMELCASE)

public class UsersSearch {
}
