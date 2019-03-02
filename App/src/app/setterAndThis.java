/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

class Frog {
    String name;
    int age;
    
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
/**
 *
 * @author tanawatwirattangsakul
 */
public class setterAndThis {
    public static void main (String args[]){
     Frog frog1 = new Frog();
    frog1.name = "Pain";
    frog1.age = 24;
    }
   
}
