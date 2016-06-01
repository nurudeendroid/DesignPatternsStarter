package io.zipcoder.designpatterns.facade;

import io.zipcoder.designpatterns.factory.BeerGlass;
import io.zipcoder.designpatterns.factory.CoffeeCup;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidginzberg on 6/1/16.
 */
public class DrinkServerTest {

    private DrinkServer server;

    @Before
    public void setUp() throws Exception {
        server = new DrinkServer();
    }

    @Test
    public void testOrderCoffee() throws Exception {

        assertTrue("Ordering coffee should produce coffee.", server.orderCoffee() instanceof CoffeeCup);

    }

    @Test
    public void testOrderBeer() throws Exception {

        assertTrue("Ordering beer should produce beer.", server.orderBeer() instanceof BeerGlass);
    }
}