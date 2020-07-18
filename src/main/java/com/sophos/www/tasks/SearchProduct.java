package com.sophos.www.tasks;

import com.sophos.www.userinterfaces.PurchaseOnlinePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sophos.www.userinterfaces.PurchaseOnlinePage.barSearchProduct;
import static com.sophos.www.userinterfaces.PurchaseOnlinePage.buttonProductFiltered;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class SearchProduct implements Task {
    private String product;

    public SearchProduct(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Enter.theValue(product).into(barSearchProduct),
                    WaitUntil.the(buttonProductFiltered, isPresent()), Click.on(buttonProductFiltered));

    }
    public static SearchProduct inTheVirtualShop(String product){
        return Tasks.instrumented(SearchProduct.class, product);
    }
}
