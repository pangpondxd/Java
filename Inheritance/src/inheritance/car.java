/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author tanawatwirattangsakul
 */


public class car extends Machine{

    @Override
    public void start() {
        System.out.println("Car Started");
    }
    
    public void showInfo(){
        System.out.println("Car name: " + name);
    }
     
    public void wipeWindShield(){
        System.out.println("wipe wind shield!");
    }
}
