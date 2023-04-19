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
public class Onion extends Vegetable
{
 private int layers;
    public Onion(String name,String color,int l)
  {
      super(name,color);
      this.layers=l;
  }
 @Override
 public boolean isTasty()
 {
     return true;
     
 }
}
