/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_vegetable;

/**
 *
 * @author srinivsi
 */
public class Potato extends Vegetable
{
    private int weight;
    public Potato(String name,String color, int w)
  {
      super(name,color); //invoked the superclass 
      this.weight=w;
  }
 @Override
 public boolean isTasty()
 {
     return true;
     
 } 
    
}
