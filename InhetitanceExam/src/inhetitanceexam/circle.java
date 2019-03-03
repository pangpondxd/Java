/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhetitanceexam;

/**
 *
 * @author tanawatwirattangsakul
 */
public class circle extends Shape{
    private String name;
    private double rad;
    public circle(String name, double rad) {
        super(name);
        System.out.println(name);
        System.out.println(rad);
    }
    public void setRad(){
        this.rad = rad;
        System.out.println(rad);
    }
    public double getArea(){
        return Math.PI * rad * rad;
    }
}
