package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.CoffeeCupDispenser;
import io.zipcoder.designpatterns.factory.CoffeeMachine;
import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;


public class CoffeeDispensingSystem extends DispensingSystem{
    public DrinkDispenser drinkDispenser(){ return new CoffeeMachine(); }

    // Uncomment after part 1 is done
    public CupDispenser cupDispenser(){
        return new CoffeeCupDispenser();
    }

}
