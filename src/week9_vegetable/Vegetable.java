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
public abstract class Vegetable 
{
private String name;
private String color;

    public Vegetable(String name,String color)
    {
        this.name=name;
        this.color=color;
    }
    public abstract boolean isTasty();
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
}
