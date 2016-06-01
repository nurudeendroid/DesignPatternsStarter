package io.zipcoder.designpatterns.factory;

/**
 * Created by davidginzberg on 6/1/16.
 */
public class CoffeeCupDispenser extends CupDispenser {

    public CoffeeCup dispense(){
        return new CoffeeCup();
    }
}
