/*
 * bsd21_team / class LiquidTest
 * Testclass for Liquid class
 * Author: Christian Graf
 * Last Change: 17.06.2022
 */

package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * this testclass tests the Liquid class
 */

public class LiquidTest {
    @BeforeEach
    public void setUp() {
    }

    /**
     * check getter of method getName
     */
    @Test
    public void getNameTest() {
        Liquid icetea = new Liquid("Icetea", 250, 0);
        icetea.setName("Icetea");
        assertEquals("Icetea", icetea.getName(),"expected icetea");
    }

    /**
     * check getter of method getVolume
     */
    @Test
    public void getVolumeTest() {
        Liquid cola = new Liquid("Cola", 330, 0);
        cola.setVolume(330);
        assertEquals(330, cola.getVolume(),"expected cola");
    }

    /**
     * check getter of method getAlcoholPercent
     */
    @Test
    public void getAlcoholPercentTest() {
        Liquid beer = new Liquid("Beer", 500, 5.1);
        beer.setAlcoholPercent(5.1);
        assertEquals(5.1, beer.getAlcoholPercent(),"expected beer");
    }

}
