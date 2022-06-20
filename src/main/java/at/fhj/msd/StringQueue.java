/*
 * bsd21_team / class StringQueue
 * Handling StringQueue
 * Author: Christian Graf
 * Last Change: 17.06.2022
 */

package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * base class for a queue of strings
 */
public class StringQueue implements IQueue
{
  /**
   * list of strings
   */
  private List<String> elements = new ArrayList<>();
  /**
   * maximum size of list
   */
  private int maxSize = 5;

  /**
   * creates an empty queue of strings
   * @param maxSize maximum size of the queue
   */
  public StringQueue(int maxSize) //fixed typo (Cypressor 17/06/2022)
  {
    this.maxSize = maxSize; // changed maxSize to this.maxSize (Cypressor 17/06/2022)
  }

  /**
   * adds a string to the queue
   * @param obj the drink to add to the queue
   * @return true if successful, false if queue is full
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * pulls a string from the queue and deletes queue entry
   * @return the first element of the queue, returns null if queue is empty
   */
  @Override
  public String poll() {
    String element = peek();

    if (elements.size() > 0) { //changed '==' to '>' (Cypressor 17/06/2022)
      elements.remove(0);
    }

    return element;
  }

  /**
   * removes the first element from the queue
   * @return null
   */
  @Override
  public String remove() {
    String element = poll();
    if (element == null) {
      throw new NoSuchElementException("there's no element any more");
    }
    element=null;

    return element;
  }

  /**
   * takes a look at the first element of the queue
   * @return first element, null if queue is empty
   */
  @Override
  public String peek() {
    String element;
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
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

} //fixed typo (Cypressor 17/06/2022)