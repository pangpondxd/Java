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
public class InhetitanceExam {
    Shape shapes[] = new Shape[3];
    shapes[0] = new circle("A", 3);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        circle cc1 = new circle("circle", 24);
        System.out.println(cc1.getArea());
        
    }
    
}
