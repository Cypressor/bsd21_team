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

public class CocktailTest
{
    @BeforeEach
    void setUp()
    {

    }

    @Test
    void getVolumeTest()
    {
        Liquid l1 = new Liquid("gin",50,38);
        Liquid l2 = new Liquid("wine",100,12);
        Liquid l3 = new Liquid("icetea", 100,0);
        Cocktail genericCocktail = new Cocktail("genericCocktail",l1,l2,l3);
        assertEquals(250,genericCocktail.getVolume(), "expected: 250");
    }

    @Test
    void getAlcoholPercentTest()
    {
        Liquid l1 = new Liquid("gin",50,38);
        Liquid l2 = new Liquid("wine",100,12);
        Liquid l3 = new Liquid("icetea", 100,0);
        Cocktail genericCocktail = new Cocktail("genericCocktail",l1,l2,l3);
        assertEquals(12.4,genericCocktail.getAlcoholPercent(), "expected: 12.4");


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
