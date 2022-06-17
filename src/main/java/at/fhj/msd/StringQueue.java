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

// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE

public class StringQueue implements IQueue
{

  private List<String> elements = new ArrayList<>();
  private int maxSize = 5;

  public StringQueue(int maxSize) //fixed typo (Cypressor 17/06/2022)
  {
    this.maxSize = maxSize; // changed maxSize to this.maxSize (Cypressor 17/06/2022)
  }

  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  @Override
  public String poll() {
    String element = peek();

    if (elements.size() > 0) { //changed '==' to '>' (Cypressor 17/06/2022)
      elements.remove(0);
    }

    return element;
  }

  @Override
  public String remove() {
    String element = poll();
    element = "";
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;

    return element;
  }

  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

} //fixed typo (Cypressor 17/06/2022)