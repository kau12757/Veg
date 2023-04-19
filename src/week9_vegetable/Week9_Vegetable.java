/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_vegetable;

import java.util.ArrayList;

/**
 *
 * @author srinivsi
 */
public class Week9_Vegetable {

    /**
     * print stirfry tasty or not
     * store veg in array
     */
    public static void main(String[] args) 
    {
        ArrayList<Vegetable> Fry = new ArrayList();
        VegetableFactory vegfac = new  VegetableFactory();
         Vegetable v1 = vegfac.getInstance("onion");
          Vegetable v2 =vegfac.getInstance("potato");
          Vegetable v3= vegfac.getInstance("carrot");
          
        
              
//        Vegetable v1 = new Onion("onion", "purple",10);
//        Vegetable v2 = new Onion("onion", "purple",10);
//        Vegetable v3 = new Onion("onion", "purple",10);
//        Vegetable v4 = new Onion("onion", "purple",10);
//        Vegetable v5 = new Onion("onion", "purple",10);
//         Vegetable v6 = new Potato("potato","yellow",2);
//          Vegetable v7 = new Carrot("carrot","orange");
          //stores object in array
          Fry.add(v1);
           Fry.add(v2);
           Fry.add(v3);
            //acces each object
            boolean tasteGood = true;
            for(  Vegetable v:  Fry)
            {
                if (v.isTasty() == false)
                {
                    tasteGood = false;
                    break;
                    
                }
                
            }
            if (tasteGood )
            {
              System.out.println("StirFry is tasting Good");
            }
            else
            {
              System.out.println("StirFry is not tasting Good");  
            }
            
           Organic c1 = new Carrot("carrot","orange");
           c1.grow();
    }
    
}
