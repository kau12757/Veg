/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9_vegetable;

/**
 *
 * @author srinivsi
 * I don't like raddish
 * kamal
 */
public class Carrot extends Vegetable implements Organic
{
    public Carrot(String name,String color)
  {
      super(name,color);
  }
   @Override
   public boolean isTasty()//abstract method
   {
       return true;
   }
    @Override
   public void grow() //interface method
   {
     System.out.println("Grew up with Pesticides? :"+Organic.PESTICIEDS_USED);
   }
}
