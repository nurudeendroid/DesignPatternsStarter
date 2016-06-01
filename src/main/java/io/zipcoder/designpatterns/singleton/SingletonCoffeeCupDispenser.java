package io.zipcoder.designpatterns.singleton;

import io.zipcoder.designpatterns.factory.CoffeeCupDispenser;


public class SingletonCoffeeCupDispenser extends CoffeeCupDispenser {

    private static SingletonCoffeeCupDispenser instance;

    private SingletonCoffeeCupDispenser(){}

    public static SingletonCoffeeCupDispenser getInstance(){
        if(null == instance)
            instance = new SingletonCoffeeCupDispenser();
        return instance;
    }
}
