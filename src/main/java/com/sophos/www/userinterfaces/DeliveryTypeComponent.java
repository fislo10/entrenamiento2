package com.sophos.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DeliveryTypeComponent {
    public static final Target storePickup=Target.the("Store pickup").
            locatedBy("//button[@class='SalesChannel__deliveryButton' and @data-name='scheduled']");
}
