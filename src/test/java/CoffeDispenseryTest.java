import io.zipcoder.designpatterns.abstractfactory.BeerDispensingSystem;
import io.zipcoder.designpatterns.abstractfactory.CoffeeDispensingSystem;
import io.zipcoder.designpatterns.abstractfactory.DispensingSystem;
import io.zipcoder.designpatterns.factory.*;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * Created by nurudeenlawal on 6/13/16.
 */
public class CoffeDispenseryTest {
    @Test
    public void coffeeCupDispense() {
        CupDispenser cupDispenser = new CoffeeCupDispenser();
        boolean condition = cupDispenser.dispense() instanceof CoffeeCup;
        Assert.assertTrue(condition);
    }

    @Test
    public void coffeeMachine(){
        DrinkDispenser drinkDispenser = new CoffeeMachine();
        boolean condition = drinkDispenser.dispense() instanceof Coffee;
        Assert.assertTrue(condition);
    }
    @Test
    public void coffeeDispensingSystemTest(){
        DispensingSystem dispensingSystem = new CoffeeDispensingSystem();
        boolean condition1 = dispensingSystem.drinkDispenser() instanceof CoffeeMachine;
        boolean condition2 = dispensingSystem.cupDispenser() instanceof  CoffeeCupDispenser;
        Assert.assertTrue(condition1);
        Assert.assertTrue(condition2);
    }

}
