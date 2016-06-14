import io.zipcoder.designpatterns.abstractfactory.BeerDispensingSystem;
import io.zipcoder.designpatterns.abstractfactory.DispensingSystem;
import io.zipcoder.designpatterns.abstractfactory.SodaDispensingSystem;
import io.zipcoder.designpatterns.factory.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nurudeenlawal on 6/13/16.
 */
public class BeerDispenseryTest {
    @Test
    public void beerGlassDispenseTest() {
        CupDispenser cupDispenser = new BeerGlassDispenser();
        boolean condition = cupDispenser.dispense() instanceof BeerGlass;
        Assert.assertTrue(condition);
    }

    @Test
    public void beerDispenserTest(){
        DrinkDispenser drinkDispenser = new BeerDispenser();
        boolean condition = drinkDispenser.dispense() instanceof Beer;
        Assert.assertTrue(condition);
    }
    @Test
    public void beerDispensingSystemTest(){
        DispensingSystem dispensingSystem = new BeerDispensingSystem();
        boolean condition1 = dispensingSystem.drinkDispenser() instanceof BeerDispenser;
        boolean condition2 = dispensingSystem.cupDispenser() instanceof  BeerGlassDispenser;
        Assert.assertTrue(condition1);
        Assert.assertTrue(condition2);
    }
}
