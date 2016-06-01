package io.zipcoder.designpatterns.singleton;

import io.zipcoder.designpatterns.factory.CoffeeMachine;


public class SingletonCoffeeMachine extends CoffeeMachine {

    private static SingletonCoffeeMachine theOnlyInstance;

    private SingletonCoffeeMachine(){}

    public static SingletonCoffeeMachine getTheOnlyInstance(){
        if(null == theOnlyInstance)
            theOnlyInstance = new SingletonCoffeeMachine();
        return theOnlyInstance;
    }
}
