package io.zipcoder.designpatterns.factory;


public class BeerDispenser extends DrinkDispenser {
    @Override
    public Beer dispense() {
        return new Beer();
    }
}
