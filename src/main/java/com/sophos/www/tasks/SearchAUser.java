package com.sophos.www.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class SearchAUser implements Task {
    private final int userID;

    public SearchAUser(int userID) {
        this.userID = userID;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
