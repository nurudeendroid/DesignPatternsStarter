package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;
import io.zipcoder.designpatterns.factory.SodaCupDispenser;
import io.zipcoder.designpatterns.factory.SodaMachine;

/**
 * Created by nurudeenlawal on 6/13/16.
 */
public class SodaDispensingSystem extends DispensingSystem {
    @Override
    public DrinkDispenser drinkDispenser() {
        return new SodaMachine();
    }

    @Override
    public CupDispenser cupDispenser() {
        return new SodaCupDispenser();
    }
}
