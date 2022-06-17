/*
 * bsd21_team / class CocktailTest
 * Testclass for Cocktail class
 * Author: Martin Lunelli
 * Last Change: 17.06.2022
 */

package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This testclass tests the cocktail class
 */

public class CocktailTest
{
    @BeforeEach
    void setUp() {}

    /**
     * Testing getVolume() method of the cocktail class by creating a cocktail object and calling
     * the getVolume() method.
     */

    @Test
    void getVolumeTest()
    {
        Liquid l1 = new Liquid("gin",50,38);
        Liquid l2 = new Liquid("wine",100,12);
        Liquid l3 = new Liquid("icetea", 100,0);
        Cocktail genericCocktail = new Cocktail("genericCocktail",l1,l2,l3);
        assertEquals(250,genericCocktail.getVolume(), "expected: 250");
    }

    /**
     * Testing getAlcoholPercent() method of the cocktail class by creating a cocktail object and calling
     * the getAlcoholPercent() method.
     */

    @Test
    void getAlcoholPercentTest()
    {
        Liquid l1 = new Liquid("gin",50,38);
        Liquid l2 = new Liquid("wine",100,12);
        Liquid l3 = new Liquid("icetea", 100,0);
        Cocktail genericCocktail = new Cocktail("genericCocktail",l1,l2,l3);
        assertEquals(12.4,genericCocktail.getAlcoholPercent(), "expected: 12.4");

        /**
         * Testing isAlcoholic method of the cocktail class by creating a cocktail object and calling
         * the isAlcoholic() method.
         */

    }
    @Test
    void isAlcoholicTest1()
    {
        Liquid l1 = new Liquid("gin",50,38);
        Liquid l2 = new Liquid("wine",100,12);
        Liquid l3 = new Liquid("icetea", 100,0);
        Cocktail genericCocktail = new Cocktail("genericCocktail",l1,l2,l3);
        assertEquals(true,genericCocktail.isAlcoholic(), "expected: true");
    }

    /**
     * Testing isAlcoholic method of the cocktail class by creating a cocktail object and calling
     * the isAlcoholic() method.
     */

    @Test
    void isAlcoholicTest2()
    {
        Liquid l1 = new Liquid("icetea", 100,0);
        Liquid l2 = new Liquid("icetea", 100,0);
        Liquid l3 = new Liquid("icetea", 100,0);
        Cocktail genericCocktail = new Cocktail("genericCocktail",l1,l2,l3);
        assertEquals(false,genericCocktail.isAlcoholic(), "expected: false");
    }

}
