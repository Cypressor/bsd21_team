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

public class SimpleDrinkTests
{
    @BeforeEach
    void setUp()
    {
    }

    @Test
    void getVolumeTest()
    {
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        assertEquals(500,banger.getVolume(),"expected: 500");
    }

    @Test
    void getAlcoholPercentTest()
    {
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        assertEquals(38,banger.getAlcoholPercent(),"expected: 38");
    }

    @Test
    void isAlcoholicTest1()
    {
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        assertEquals(true,banger.isAlcoholic(),"expected: true");
    }

    @Test
    void isAlcoholicTest2()
    {
        Liquid icetea = new Liquid("Gin",500, 0);
        SimpleDrink notABanger = new SimpleDrink("NotABanger",icetea);
        assertEquals(false,notABanger.isAlcoholic(),"expected: false");
    }

}
