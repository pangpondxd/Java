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
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Machine mach1 = new Machine();
        mach1.start();
        mach1.stop();
        car car1 = new car();
        car1.start();
        car1.wipeWindShield();
        car1.showInfo();
        car1.stop();
        
    }
    
}
