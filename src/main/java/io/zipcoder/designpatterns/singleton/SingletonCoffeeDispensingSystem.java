package io.zipcoder.designpatterns.singleton;


import io.zipcoder.designpatterns.abstractfactory.CoffeeDispensingSystem;


public class SingletonCoffeeDispensingSystem extends CoffeeDispensingSystem {

    @Override
    public SingletonCoffeeMachine drinkDispenser() {
        return SingletonCoffeeMachine.getInstance();
    }

    @Override
    public SingletonCoffeeCupDispenser cupDispenser() {
        return SingletonCoffeeCupDispenser.getInstance();
    }
}
