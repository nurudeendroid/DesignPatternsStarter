package io.zipcoder.designpatterns.factory;

public class CoffeeCup implements Cup {

    private Drink contents;

    @Override
    public void fill(Drink d) {
        contents = d;
    }
}
