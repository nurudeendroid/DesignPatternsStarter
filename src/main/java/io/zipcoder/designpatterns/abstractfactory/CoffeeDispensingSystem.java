package io.zipcoder.designpatterns.abstractfactory;

import io.zipcoder.designpatterns.factory.CoffeeCupDispenser;
import io.zipcoder.designpatterns.factory.CoffeeMachine;
import io.zipcoder.designpatterns.factory.CupDispenser;
import io.zipcoder.designpatterns.factory.DrinkDispenser;


class CoffeeDispensingSystem extends DispensingSystem{

    @Override
    public DrinkDispenser drinkDispenser(){ return new CoffeeMachine(); }

    /* Uncomment after part 1 is done */
    @Override
    public CupDispenser cupDispenser(){
        return new CoffeeCupDispenser();
    }

}
