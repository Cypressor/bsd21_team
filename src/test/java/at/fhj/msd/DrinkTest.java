package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * this testclass tests the Drink class
 */

public class DrinkTest
{
    @BeforeEach
    void setUp() {}

    /**
     * this tests if the name-getter and name-setter of Drink class are working.
     */

    @Test
    void NameTest()
    {
        Liquid gin = new Liquid("Gin",500, 38);
        Drink drink = new SimpleDrink("banger",gin);
        drink.setName("banger");
        assertEquals("banger",drink.getName(),"expected: banger");;
    }
}
