/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticandfinal;

/**
 *
 * @author tanawatwirattangsakul
 */
class Thing{
    public final static int LUCKEY_NUMBER = 7;
    public String name;
    public static String description;
    public int id;
    public static int count = 0;
    public Thing(){
        id = count;
        count++;
    }
    public void showName(){
        System.out.println("id: " + id + ", " + description);
    }
    public static void showInfo(){
        System.out.println(description);
    }
}

public class StaticAndFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thing.description = "I am Tanawat";
        System.out.println("Before creating object : " + Thing.count);
       Thing.showInfo();
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        System.out.println("After creating object : " + Thing.count);
        thing1.name = "Jo";
        thing2.name = "Jane";
        
        System.out.println(thing1.name);
        System.out.println(thing2.name);
        
        thing1.showName();
        thing2.showName();
        
        System.out.println(Math.PI);
//        Math.PI = 3;
        System.out.println(Thing.LUCKEY_NUMBER);
    }
    
}
