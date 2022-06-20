/*
 * bsd21_team / class DrinkQueue
 * Queue for handling drinks
 * Author: Martin Lunelli
 * Last Change: 17.06.2022
 */

package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * base class for a queue of drinks
 */
public class DrinkQueue implements IDrinkQueue
{
  /**
   * list of Drinks
   */
  private List<Drink> elements = new ArrayList<>();
  /**
   * maximum size of list
   */
  private int maxSize = 5;

  /**
   * creates an empty queue of drinks
   * @param maxSize maximum size of the queue
   */
  public DrinkQueue(int maxSize)
  {
    this.maxSize = maxSize;
  }

  /**
   * adds a drink to the queue
   * @param drink the drink to add to the queue
   * @return true if successful, false if queue is full
   */
  @Override
  public boolean offer(Drink drink) {
    if (elements.size() != maxSize)
      elements.add(drink);
    else
      return false;

    return true;
  }

  /**
   * pulls a drink from the queue and deletes queue entry
   * @return the first element of the queue, returns null if queue is empty
   */
  @Override
  public Drink poll() {
    Drink element = peek();

    if (elements.size() > 0) {
      elements.remove(0);
    }

    return element;
  }

  /**
   * removes the first element from the queue
   * @return null
   */
  @Override
  public Drink remove() {
    Drink element = poll();
    if (element == null) {
      throw new NoSuchElementException("there's no element any more");
    }
    element = null;

    return element;
  }

  /**
   * takes a look at the first element of the queue
   * @return first element, null if queue is empty
   */
  @Override
  public Drink peek() {
    Drink element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  /**
   * takes a look at the first element of the queue
   * @return first element, throws exception if queue is empty
   */
  @Override
  public Drink element() {
    Drink element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}