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

/**
 * this testclass tests the DrinkQueue class
 */

public class DrinkQueueTest
{

    @BeforeEach
    void setUp() {}

    /**
     * testing the offer() method of the drinkQueue class by calling the offer() method.
     * it is expected to return true, since the queue is not full already.
     */

    @Test
    void offerTest1()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        assertEquals(true,drinkQueue.offer(banger), "expected: true");
    }

    /**
     * testing the offer() method of the drinkQueue class by calling the offer() method.
     * it is expected to return false, since the queue is full already.
     */

    @Test
    void offerTest2()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        drinkQueue.offer(banger);
        assertEquals(false,drinkQueue.offer(banger), "expected: false");
    }

    /**
     * testing the poll() method of the drinkQueue class by calling the poll() method.
     * it is expected to return the object that it has been passed by the offer() method.
     */

    @Test
    void pollTest1()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        drinkQueue.offer(banger);
        assertEquals(banger,drinkQueue.poll(), "expected: banger");
    }

    /**
     * testing the poll() method of the drinkQueue class by calling the poll() method.
     * it is expected to return null since it has not been passed any object.
     */

    @Test
    void pollTest2()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        assertEquals(null,drinkQueue.poll(), "expected: null");
    }

    /**
     * testing the remove() method of the drinkQueue class by calling the remove() method.
     * it is expected to return null, because the queue is not empty.
     */

    @Test
    void removeTest1()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        drinkQueue.offer(banger);
        assertEquals(null,drinkQueue.remove(), "expected: null");
    }
    /**
     * testing the remove() method of the drinkQueue class by calling the remove() method.
     * it is expected to return an exception, because the queue is empty.
     */

    @Test
    void removeTest2()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> drinkQueue.remove());
        assertEquals("there's no element any more", exception.getMessage(), "expected: exception");
    }

    /**
     * testing the peek() method of the drinkQueue class by calling the peek() method.
     * it is expected to return the object that it has been passed by the offer() method.
     */

    @Test
    void peekTest1()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        drinkQueue.offer(banger);
        assertEquals(banger,drinkQueue.peek(), "expected: banger");
    }

    /**
     * testing the peek() method of the drinkQueue class by calling the peek() method.
     * it is expected to return null since it has not been passed any object.
     */

    @Test
    void peekTest2()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        assertEquals(null,drinkQueue.peek(), "expected: null");
    }

    /**
     * testing the element() method of the drinkQueue class by calling the element() method.
     * it is expected to return the object that it has been passed by the offer() method.
     */

    @Test
    void elementTest1()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        Liquid gin = new Liquid("Gin",500, 38);
        SimpleDrink banger = new SimpleDrink("Banger",gin);
        drinkQueue.offer(banger);
        assertEquals(banger,drinkQueue.element(), "expected: banger");
    }

    /**
     * testing the element() method of the drinkQueue class by calling the element() method.
     * it is expected to return an exception, because the queue is empty.
     */

    @Test
    void elementTest2()
    {
        DrinkQueue drinkQueue = new DrinkQueue(1);
        NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> drinkQueue.element());
        assertEquals("there's no element any more", exception.getMessage(), "expected: exception");
    }

}
