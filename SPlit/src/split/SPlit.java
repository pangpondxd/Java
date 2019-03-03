/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package split;

/**
 *
 * @author tanawatwirattangsakul
 */
public class SPlit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "phuket.psu.ac.th/aaa.html";
        String[] arrOfStr = str.split("/");
        String part1 = arrOfStr[0];
        String part2 = arrOfStr[1];
        System.out.println(part2);
        }
        
    }
   
