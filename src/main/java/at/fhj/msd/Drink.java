/*
 * bsd21_team / class Drink
 * Handling queue for drinks
 * Author: Christian Graf
 * Last Change: 17.06.2022
 */

package at.fhj.msd;

/**
 * abstract base class for concrete drink classes
 */
public abstract class Drink {
    /**
     * name of the drink
     */
    protected String name;
    /**
     * creates a Drink object with given name
     *
     * @param name name of the drink
     *
     */
    public Drink(String name) {
        this.name = name;
    }
    /**
     * calculates and returns volume of drink
     *
     * @return the volume of drink in liter
     */
    public abstract double getVolume();
    /**
     * calculates and returns the alcohol percentage
     *
     * @return alcohol volume percent (e.g. 50)
     */
    public abstract double getAlcoholPercent();
    /**
     * gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    public abstract boolean isAlcoholic();

    /**
     * getter for name
     * @return name
     */

    public String getName() {
        return name;
    }
    /**
     * setter for name
     */

    public void setName(String name) {
        this.name = name;
    }
}
