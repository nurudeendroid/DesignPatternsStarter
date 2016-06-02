package io.zipcoder.designpatterns.observer;

import io.zipcoder.designpatterns.facade.DrinkServer;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalesManagerTest {

    AbstractSalesManager manager;
    DrinkServer drinkServer;

    @Before
    public void setup(){
        drinkServer = new DrinkServer();
    }

    @Test
    public void testGeneralSalesManagerTalliesAllDrinks(){
        manager = new GeneralSalesManager();
        manager.manage(drinkServer);

        drinkServer.orderBeer();
        drinkServer.orderBeer();
        drinkServer.orderBeer();

        drinkServer.orderCoffee();
        drinkServer.orderCoffee();

        assertEquals(5, manager.getDrinkTotal());


    }

    @Test
    public void testBeerSalesManagerTalliesOnlyBeer(){
        manager = new BeerSalesManager();
        manager.manage(drinkServer);

        drinkServer.orderBeer();
        drinkServer.orderBeer();
        drinkServer.orderBeer();

        drinkServer.orderCoffee();
        drinkServer.orderCoffee();

        assertEquals(3, manager.getDrinkTotal());


    }

}