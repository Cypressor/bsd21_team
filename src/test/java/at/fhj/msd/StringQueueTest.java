/*
 * bsd21_team / class StringQueueTest
 * Testclass for StringQueue class
 * Author: Christian Graf
 * Last Change: 17.06.2022
 */

package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class StringQueueTest {
    @BeforeEach
    public void setUp() {
    }

    @Test
    void offerTest1()
    {
        StringQueue stringQueue = new StringQueue(1);
        String string = "test";
        assertEquals(true, stringQueue.offer(string), "expected: true");
    }

    @Test
    void offerTest2()
    {
        StringQueue stringQueue = new StringQueue(1);
        String string = "test";
        stringQueue.offer(string);
        assertEquals(false, stringQueue.offer(string), "expected: false");
    }

    @Test
    void pollTest1()
    {
        StringQueue stringQueue = new StringQueue(1);
        String string = "test";
        stringQueue.offer(string);
        assertEquals(string, stringQueue.poll(), "expected: string");
    }

    @Test
    void pollTest2()
    {
        StringQueue stringQueue = new StringQueue(1);
        assertEquals(null, stringQueue.poll(), "expected: null");
    }

    @Test
    void removeTest1()
    {
        StringQueue stringQueue = new StringQueue(1);
        String string = "test";
        stringQueue.offer(string);
        assertEquals(null, stringQueue.remove(), "expected: null");
    }
    @Test
    void removeTest2()
    {
        StringQueue stringQueue = new StringQueue(1);
        NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> stringQueue.remove());
        assertEquals("there's no element any more", exception.getMessage(), "expected: exception");
    }

    @Test
    void peekTest1()
    {
        StringQueue stringQueue = new StringQueue(1);
        String string = "test";
        stringQueue.offer(string);
        assertEquals(string, stringQueue.peek(), "expected: string");
    }

    @Test
    void peekTest2()
    {
        StringQueue stringQueue = new StringQueue(1);
        assertEquals(null, stringQueue.peek(), "expected: null");
    }

    @Test
    void elementTest1()
    {
        StringQueue stringQueue = new StringQueue(1);
        String string = "test";
        stringQueue.offer(string);
        assertEquals(string, stringQueue.element(), "expected: string");
    }

    @Test
    void elementTest2()
    {
        StringQueue stringQueue = new StringQueue(1);
        NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> stringQueue.element());
        assertEquals("there's no element any more", exception.getMessage(), "expected: exception");
    }
}
