/*
 * bsd21_team / class LiquidTest
 * Testclass for Liquid class
 * Author: Christian Graf
 * Last Change: 17.06.2022
 */

package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LiquidTest {
    @BeforeEach
    public void setUp() {
    }

    @Test
    public void getNameTest() {
        Liquid icetea = new Liquid("Icetea", 250, 0);
        assertEquals("Icetea", icetea.getName(),"expected icetea");
    }

    @Test
    public void getVolumeTest() {
        Liquid cola = new Liquid("Cola", 330, 0);
        assertEquals(330, cola.getVolume(),"expected cola");
    }

    @Test
    public void getAlcoholPercentTest() {
        Liquid beer = new Liquid("Beer", 500, 5.1);
        assertEquals(5.1, beer.getAlcoholPercent(),"expected beer");
    }

}
