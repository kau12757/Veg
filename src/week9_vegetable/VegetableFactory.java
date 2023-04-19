/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_vegetable;

/**
 * generate objects
 * @author srinivsi
 */
public class VegetableFactory
{
    private Vegetable veg;
    public Vegetable getInstance(String vegType) // onion
    {
        if(vegType.compareToIgnoreCase("onion")==0)
        {
            veg = new Onion("onion","purple",100);
        }
        else if (vegType.compareToIgnoreCase("potato")==0)
        {
            veg = new Potato("potato","purple",2);
        }
        
        else if (vegType.compareToIgnoreCase("carrot")==0)
        {
            veg = new Carrot("carrot","orange");
        }
        return veg;
    }
}
