package io.zipcoder.designpatterns.observer;

import io.zipcoder.designpatterns.facade.DrinkServer;

import java.util.Observer;


public abstract class AbstractSalesManager implements Observer{

    private int totalSales = 0;

    protected void tallySales(){
        totalSales++;
    }

    public void manage(DrinkServer drinkServer){
        drinkServer.addObserver(this);
    }

    public void stopManaging(DrinkServer drinkServer){
        drinkServer.deleteObserver(this);
    }

    public String getSalesNumbers(){
        return String.format("%s counts %d drinks sold.", this.getClass().getSimpleName(), totalSales);
    }

    public int getDrinkTotal(){
        return totalSales;
    }

    @Override
    public String toString() {
        return getSalesNumbers();
    }
}
