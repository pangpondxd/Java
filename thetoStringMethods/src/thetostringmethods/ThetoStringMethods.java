/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thetostringmethods;

 class foo{
     private int id;
     private String name;
    public foo(int id, String name){
       this.id = id;
       this.name = name;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);
        return sb.toString();
    }
}
/**
 *
 * @author tanawatwirattangsakul
 */
public class ThetoStringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        foo f1 = new foo(1,"Tanawat");
        foo f2 = new foo(2,"Jane");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
    
}
