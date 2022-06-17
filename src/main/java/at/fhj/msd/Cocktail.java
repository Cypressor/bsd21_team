/*
 * bsd21_team / class Cocktai
 * Handling Cocktail
 * Author: Christian Graf
 * Last Change: 17.06.2022
 */

package at.fhj.msd;
/**
 * Class represents a coktail which can be used in
 * drinks
 */
public class Cocktail extends Drink{
    /**
     * uses several liquids
     */
    protected Liquid l1;
    protected Liquid l2;
    protected Liquid l3;
    /**
     * Creates a Cocktail object with given name and
     * liquids
     *
     * @param name name of drink
     * @param l1 one liquid in drink
     * @param l2 one liquid in drink
     * @param l3 one liquid in drink
     */
    Cocktail(String name, Liquid l1,Liquid l2, Liquid l3){
        super(name);
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    /**
     * Returns volume of liquid l1
     *
     * @return the volume of drink in litre
     */
    @Override
    public double getVolume() {
        double volume=0;
        volume=l1.getVolume()+l2.getVolume()+l3.getVolume();
         return volume;
    }

    /**
     * Returns alcohol volume percent of liquid l
     *
     * @return alcohol volume percent
     */
    @Override
    public double getAlcoholPercent() {
        double alcoholPercent=0;
        alcoholPercent=(l1.getVolume()*l1.getAlcoholPercent()+l2.getVolume()*l2.getAlcoholPercent()
                + l3.getVolume()*l3.getAlcoholPercent())/this.getVolume();
        return alcoholPercent;
    }
    /**
     * Gives information if drink is alcoholic or not
     *
     * @return true when alcoholic liquids are present, otherwise false
     */
    @Override
    public boolean isAlcoholic() {
        if(this.getAlcoholPercent() > 0){
            return true;
        }
        return false;
    }
}
