/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilderandstringformating;

/**
 *
 * @author tanawatwirattangsakul
 */
public class StringBuilderAndStringFormating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String info = "";
        info += "My name is Jo";
        info += " ";
        info += "I am a builder";
        System.out.println(info);
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Jo");
        sb.append(" ");
        sb.append("I am a builder");
        
        System.out.println(sb.toString());
        
        StringBuilder s = new StringBuilder();
        s.append("My name is Jane")
       .append(" ")
       .append("I am a builder");
        System.out.println(s.toString());
        
        /////Formatting/////
        System.out.print("Here is some text. \tThat was a tab.\nThat was a new line");
        System.out.println("Text");
        System.out.printf("Total cost %d", 5);
        for(int i = 0; i<=20 ; i++){
            System.out.printf("%2d: sone text here\n", i);
        }
    }
    
}
