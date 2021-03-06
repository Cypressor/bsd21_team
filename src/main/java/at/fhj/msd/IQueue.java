/*
 * bsd21_team / interface IQueue
 * Handling IQueue
 * Author: Christian Graf
 * Last Change: 17.06.2022
 */

package at.fhj.msd;

/**
 * interface for the string queue
 */
public interface IQueue {
  /**
  add object to queue, return true if works, otherwise false
  */
  public abstract boolean offer(String obj);

  /**
  returns and deletes first element; null if no element in there
   */
  public abstract String poll();

  /**
  like poll but if no element exists NoSuchElementException is thrown instead of null return value
   */
  public abstract String remove();

  /**
  gives first element but does not delete, null if nothing there
   */
  public abstract String peek();

  /**
  like peek but NoSuchElementException instead of null
   */
  public abstract String element();
}