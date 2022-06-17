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

    /**
     * testing the offer() method by creating a string queue and calling the offer() method
     * It is expected to return true, since the queue is not full already.
     */
    @Test
    void offerTest1()
    {
        StringQueue stringQueue = new StringQueue(1);
        String string = "test";
        assertEquals(true, stringQueue.offer(string), "expected: true");
    }

    /**
     * testing the offer() method by creating a string queue and calling the offer() method
     * It is expected to return false, since the queue is full already.
     */
    @Test
    void offerTest2()
    {
        StringQueue stringQueue = new StringQueue(1);
        String string = "test";
        stringQueue.offer(string);
        assertEquals(false, stringQueue.offer(string), "expected: false");
    }

    /**
     * testing the poll()method by creating a string queue and calling the poll() method
     * It is expected to return the string that it has been passed by the offer() method
     */
    @Test
    void pollTest1()
    {
        StringQueue stringQueue = new StringQueue(1);
        String string = "test";
        stringQueue.offer(string);
        assertEquals(string, stringQueue.poll(), "expected: string");
    }

    /**
     * testing the poll()method by creating a string queue and calling the poll() method
     * It is expected to return null, since it has not been passed any string.
     */
    @Test
    void pollTest2()
    {
        StringQueue stringQueue = new StringQueue(1);
        assertEquals(null, stringQueue.poll(), "expected: null");
    }

    /**
     * testing the remove()method of the string queue class by calling a remove() method
     * It is expected to return null, because the queue is not empty.
     */
    @Test
    void removeTest1()
    {
        StringQueue stringQueue = new StringQueue(1);
        String string = "test";
        stringQueue.offer(string);
        assertEquals(null, stringQueue.remove(), "expected: null");
    }

    /**
     * testing the remove()method of the string queue class by calling a remove() method
     * It is expected to return an exception, because the queue is empty.
     */
    @Test
    void removeTest2()
    {
        StringQueue stringQueue = new StringQueue(1);
        NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> stringQueue.remove());
        assertEquals("there's no element any more", exception.getMessage(), "expected: exception");
    }

     /**
     * testing the peek()method of the string queue class by calling a peek() method
     * It is expected to return the string that it has been passed by the offer() method
     */
    @Test
    void peekTest1()
    {
        StringQueue stringQueue = new StringQueue(1);
        String string = "test";
        stringQueue.offer(string);
        assertEquals(string, stringQueue.peek(), "expected: string");
    }

    /**
     * testing the peek()method of the string queue class by calling a peek() method
     * It is expected to return null, since it has not been passed any string.
     */
    @Test
    void peekTest2()
    {
        StringQueue stringQueue = new StringQueue(1);
        assertEquals(null, stringQueue.peek(), "expected: null");
    }

    /**
     * testing the element()method of the string queue class by calling the element() method
     * It is expected to return the string that it has been passed by the offer() method
     */
    @Test
    void elementTest1()
    {
        StringQueue stringQueue = new StringQueue(1);
        String string = "test";
        stringQueue.offer(string);
        assertEquals(string, stringQueue.element(), "expected: string");
    }

    /**
     * testing the element()method of the string queue class by calling the element() method
     * It is expected to return an exception, because the queue is empty.
     */
    @Test
    void elementTest2()
    {
        StringQueue stringQueue = new StringQueue(1);
        NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> stringQueue.element());
        assertEquals("there's no element any more", exception.getMessage(), "expected: exception");
    }
}
