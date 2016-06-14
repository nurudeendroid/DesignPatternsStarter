package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.DrinkDispenser;
import io.zipcoder.designpatterns.factory.CupDispenser;

public abstract class DispensingSystem{
    public abstract DrinkDispenser drinkDispenser();

    // Uncomment this method and the corresponding import when you have implemented CupDispenser in part 1
    public abstract CupDispenser cupDispenser();

}