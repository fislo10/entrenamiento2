package com.sophos.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PurchaseOnlinePage {
    public static final Target barSearchProduct= Target.the("bar of Search of the Product").
            locatedBy("//input[@type='search']");
    public static final Target buttonProductFiltered= Target.the("button of the filter Product filtered").
            locatedBy("(//div[@class='buy-button-normal'])[1]");

}
