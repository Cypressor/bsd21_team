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

public class DrinkQueue implements IDrinkQueue
{

  private List<Drink> elements = new ArrayList<>();
  private int maxSize = 5;

  public DrinkQueue(int maxSize) //fixed typo (Cypressor 17/06/2022)
  {
    this.maxSize = maxSize; // changed maxSize to this.maxSize (Cypressor 17/06/2022)
  }

  @Override
  public boolean offer(Drink drink) {
    if (elements.size() != maxSize)
      elements.add(drink);
    else
      return false;

    return true;
  }

  @Override
  public Drink poll() {
    Drink element = peek();

    if (elements.size() > 0) { //changed '==' to '>' (Cypressor 17/06/2022)
      elements.remove(0);
    }

    return element;
  }

  @Override
  public Drink remove() {
    Drink element = poll();
    if (element == null) {
      throw new NoSuchElementException("there's no element any more");
    }
    element = null;

    return element;
  }

  @Override
  public Drink peek() {
    Drink element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  @Override
  public Drink element() {
    Drink element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

} //fixed typo (Cypressor 17/06/2022)