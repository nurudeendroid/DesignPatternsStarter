package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.*;

/**
 * Created by nurudeenlawal on 6/13/16.
 */
public class BeerDispensingSystem extends DispensingSystem {
    @Override
    public DrinkDispenser drinkDispenser() {
        return new BeerDispenser();
    }

    @Override
    public CupDispenser cupDispenser() {
        return new BeerGlassDispenser();
    }
}
