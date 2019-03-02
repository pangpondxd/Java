/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setterandthis;
class Frog{
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setInfo(String name,int age){
        setName(name);
        setAge(age);
    }
}
/**
 *
 * @author tanawatwirattangsakul
 */
public class SetterAndThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Frog frog1 = new Frog();
        Frog frog2 = new Frog();
//        frog1.name = "pain";
//        frog1.age = 24;
        frog1.setAge(25);
        frog1.setName("Jane");
        frog2.setInfo("Dukdui", 1);
        System.out.println("Hello: " + frog2.getName());
        System.out.println("Taetae: " + frog2.getAge());
        System.out.println("Name: " + frog1.getName());
        System.out.println("Age: " + frog1.getAge());
    }
    
}
