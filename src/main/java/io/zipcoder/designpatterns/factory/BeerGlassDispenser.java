package io.zipcoder.designpatterns.factory;

/**
 * Created by davidginzberg on 6/1/16.
 */
public class BeerGlassDispenser extends CupDispenser {

    @Override
    public Cup dispense() {
        return new BeerGlass();
    }
}
