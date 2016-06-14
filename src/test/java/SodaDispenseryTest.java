import io.zipcoder.designpatterns.abstractfactory.DispensingSystem;
import io.zipcoder.designpatterns.abstractfactory.SodaDispensingSystem;
import io.zipcoder.designpatterns.factory.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by nurudeenlawal on 6/13/16.
 */
public class SodaDispenseryTest {

    @Test
    public void sodaCupDispenserTest(){
        CupDispenser cupDispenser = new SodaCupDispenser();
        boolean condition = cupDispenser.dispense() instanceof SodaCup;
        Assert.assertTrue(condition);
    }
    @Test
    public void sodaDispenseTest() {
        DrinkDispenser drinkDispenser = new SodaMachine();
        boolean condition = drinkDispenser.dispense() instanceof Soda;
        Assert.assertTrue(condition);
    }
    @Test
    public void sodaDispensingSystemTest(){
        DispensingSystem dispensingSystem = new SodaDispensingSystem();
        boolean condition1 = dispensingSystem.drinkDispenser() instanceof SodaMachine;
        boolean condition2 = dispensingSystem.cupDispenser() instanceof  SodaCupDispenser;
        Assert.assertTrue(condition1);
        Assert.assertTrue(condition2);
    }

}
