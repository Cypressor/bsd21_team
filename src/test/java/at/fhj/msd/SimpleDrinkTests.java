/*
 * bsd21_team / class SimpleDrinkTest
 * Testclass for SimpleDrink class
 * Author: Martin Lunelli
 * Last Change: 17.06.2022
 */

package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This testclass tests the SimpleDrink class
 */

public class SimpleDrinkTests
{
    @BeforeEach
    void setUp()
    {
    }

    /**
     * Testing getVolume() method of the SimpleDrink class by creating a SimpleDrink object and calling
     * the getVolume() method.
     */

    @Test
    void getVolumeTest()
    {
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        assertEquals(500,banger.getVolume(),"expected: 500");
    }

    /**
     * Testing getAlcoholPercent() method of the SimpleDrink class by creating a SimpleDrink object and calling
     * the getAlcoholPercent() method.
     */

    @Test
    void getAlcoholPercentTest()
    {
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        assertEquals(38,banger.getAlcoholPercent(),"expected: 38");
    }

    /**
     * Testing isAlcoholic() method of the SimpleDrink class by creating a SimpleDrink object and calling
     * the isAlcoholic() method.
     */

    @Test
    void isAlcoholicTest1()
    {
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        assertEquals(true,banger.isAlcoholic(),"expected: true");
    }

    /**
     * Testing isAlcoholic() method of the SimpleDrink class by creating a SimpleDrink object and calling
     * the isAlcoholic() method.
     */

    @Test
    void isAlcoholicTest2()
    {
        Liquid icetea = new Liquid("Gin",500, 0);
        SimpleDrink notABanger = new SimpleDrink("NotABanger",icetea);
        assertEquals(false,notABanger.isAlcoholic(),"expected: false");
    }

}
