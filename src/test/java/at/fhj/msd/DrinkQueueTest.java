/*
 * bsd21_team / class DrinkQueueTest
 * Testclass for DrinkQueue class
 * Author: Martin Lunelli
 * Last Change: 17.06.2022
 */

package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DrinkQueueTest
{

    @BeforeEach
    void setUp()
    {

    }

    @Test
    void offerTest1()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        assertEquals(true,drinkQueue.offer(banger), "expected: true");
    }

    @Test
    void offerTest2()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        drinkQueue.offer(banger);
        assertEquals(false,drinkQueue.offer(banger), "expected: false");
    }

    @Test
    void pollTest1()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        drinkQueue.offer(banger);
        assertEquals(banger,drinkQueue.poll(), "expected: banger");
    }

    @Test
    void pollTest2()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        assertEquals(null,drinkQueue.poll(), "expected: null");
    }

    @Test
    void removeTest1()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        drinkQueue.offer(banger);
        assertEquals(null,drinkQueue.remove(), "expected: null");
    }

    @Test
    void removeTest2()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> drinkQueue.remove());
        assertEquals("there's no element any more", exception.getMessage(), "expected: exception");
    }

    @Test
    void peekTest1()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        drinkQueue.offer(banger);
        assertEquals(banger,drinkQueue.peek(), "expected: banger");
    }

    @Test
    void peekTest2()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        assertEquals(null,drinkQueue.peek(), "expected: null");
    }

    @Test
    void elementTest1()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        drinkQueue.offer(banger);
        assertEquals(banger,drinkQueue.element(), "expected: banger");
    }

    @Test
    void elementTest2()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> drinkQueue.element());
        assertEquals("there's no element any more", exception.getMessage(), "expected: exception");
    }

}
