/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructure;
class Machine {
    private String name;
    public Machine(){
        System.out.println("Constructor running!");
        String name = "Jo";
    }
    public Machine(String name){
        System.out.println("2nd Constructor running!");
        this.name = name;
    }
}
/**
 *
 * @author tanawatwirattangsakul
 */
public class Constructure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Pain");
        new Machine();
      
    }
    
}
