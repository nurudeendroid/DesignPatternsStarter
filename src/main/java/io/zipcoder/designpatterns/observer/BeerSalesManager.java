package io.zipcoder.designpatterns.observer;

import java.util.Observable;

public class BeerSalesManager extends AbstractSalesManager{

        @Override
        public void update(Observable o, Object arg) {
            if ("Beer".equals(arg))
                tallySales();
        }
}
