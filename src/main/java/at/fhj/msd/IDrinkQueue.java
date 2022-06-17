/*
 * bsd21_team / interface IDrinkQueue
 * Handling IDrinkQueue
 * Author: Christian Graf
 * Last Change: 17.06.2022
 */

package at.fhj.msd;

/**
 * interface for the drink queue
 */
public interface IDrinkQueue {
  /**
  add string to queue, return true if works, otherwise false
  */
  public abstract boolean offer(Drink drink);

  /**
  returns and deletes first element; null if no element in there
   */
  public abstract Drink poll();

  /**
  like poll but if no element exists NoSuchElementException is thrown instead of null return value
   */
  public abstract Drink remove();

  /**
  gives first element but does not delete, null if nothing there
   */
  public abstract Drink peek();

  /**
  like peek but NoSuchElementException instead of null
   */
  public abstract Drink element();
}