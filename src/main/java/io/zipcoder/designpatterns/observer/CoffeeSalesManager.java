package io.zipcoder.designpatterns.observer;

import java.util.Observable;


public class CoffeeSalesManager extends AbstractSalesManager {



    @Override
    public void update(Observable o, Object arg) {
        if ("Coffee".equals(arg))
            tallySales();
    }
}
