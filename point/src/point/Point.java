/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package point;

/**
 *
 * @author tanawatwirattangsakul
 */
public class Point {
    int x;
    int y;
    public Point (int argX, int argY){
        x = argX;
        y = argY;
    }
    public static void func(Point arg1,Point arg2){
        arg1.x = 100;
        arg1.y = 100;
        Point temp = arg1;
        arg1 = arg2;
        arg2 = temp;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point pnt1 = new Point(0,0);
        Point pnt2 = new Point(0,0);
        System.out.println("X: " + pnt1.x + "Y: " + pnt1.y);
        System.out.println("X: " + pnt2.x + "Y: " + pnt2.y);
        System.out.println(" ");
        func(pnt1,pnt2);
        System.out.println("X: " + pnt1.x + "Y: " + pnt1.y);
        System.out.println("X: " + pnt2.x + "Y: " + pnt2.y);
        
                
        
    }
    
}
