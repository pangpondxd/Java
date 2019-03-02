/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foo;

/**
 *
 * @author tanawatwirattangsakul
 */
class Dice {
    private int face;
    public Dice(){
        face = 1;
        this.face = face;
    
    }
    public void roll(){
        face = (int)(Math.random() * 7);
        if(face == 0){
           face = (int)(Math.random() * 7);
        }
        this.face = face;
    }
    public int getFace(){
        return face;
    }
}
class Dicebox{
    Dice d1 = new Dice();
    Dice d2 = new Dice();
    Dice d3 = new Dice();
    int totle1, totle=0;
  
    public void add(Dice d1){
        totle1 = d1.getFace();
        totle = totle + totle1;
    }
    
    public void shake(){
        d1.roll();
        d2.roll();
        d3.roll();
        totle = d1.getFace() + d2.getFace() + d3.getFace();
      
    }
    public void printDices(){
        System.out.println("1. Face = " + d1.getFace());
        System.out.println("2. Face = " + d2.getFace());
        System.out.println("3. Face = " + d3.getFace());
    }
    public int getTotle(){
      return totle;
        
    }
}
public class Foo {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dice d1 = new Dice();
        System.out.println("Face = " + d1.getFace());
        d1.roll();
        System.out.println("Face = " + d1.getFace());
        Dicebox box = new Dicebox();
        box.add(d1);
        box.add(new Dice());
        box.add(new Dice());
        System.out.println("Before shaking: totle = " + box.getTotle());
        box.shake();
        System.out.println("After shaking totle = " + box.getTotle());
        box.printDices();
    }
    
}
