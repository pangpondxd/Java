/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author tanawatwirattangsakul
 */
class Robot {
    public void speak (String text) {
        System.out.println(text);
    }
    public void jump (int height) {
        System.out.println("Jumping: " + height);
    }
    public void move(String direction, double distance) {
        System.out.println("Moving " + distance + "meters in direction " + direction);
    }
}
   
public class App {

    /**
     * @param args the command line arguments
     */
  
     
    public static void main(String[] args) {
        // TODO code application logic here
      Robot sam = new Robot();
      sam.speak("Hi I'm Sam");
      sam.jump(200);
      sam.move("up", 20.8);
    }
}