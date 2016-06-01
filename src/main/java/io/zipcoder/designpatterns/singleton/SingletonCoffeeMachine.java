package io.zipcoder.designpatterns.singleton;

import io.zipcoder.designpatterns.factory.CoffeeMachine;


public class SingletonCoffeeMachine extends CoffeeMachine {

    private static SingletonCoffeeMachine instance;

    private SingletonCoffeeMachine(){}

    public static SingletonCoffeeMachine getInstance(){
        if(null == instance )
            instance = new SingletonCoffeeMachine();
        return instance;
    }
}
