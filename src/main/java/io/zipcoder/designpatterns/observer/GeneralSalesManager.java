package io.zipcoder.designpatterns.observer;

import java.util.Observable;


public class GeneralSalesManager extends AbstractSalesManager {

    @Override
    public void update(Observable o, Object arg) {
        tallySales();
    }
}
