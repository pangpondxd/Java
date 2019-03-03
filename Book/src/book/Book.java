/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author tanawatwirattangsakul
 */
public class Book {
    private String title;
    private int numOfPage;
    public void Book() {
        
    }
    public void Book(String title,int numOfPage){
        this.title = title;
        this.numOfPage = numOfPage;
    }
    public void setnumOfPage(int numOfPage){
        this.numOfPage = numOfPage;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public int getnumOfPage(){
        return numOfPage;
    }
    public boolean isMorePages(Book argBook){
        if(numOfPage < argBook.numOfPage)
            return true;
        return false;
    }
    public static boolean compareBook(Book argBook1,Book argBook2){
        if(argBook1.numOfPage == argBook2.numOfPage)
            return true;
        return false;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(title).append(": ").append(numOfPage);
        return sb.toString();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book b1 = new Book();
        Book b2 = new Book();
        b1.setTitle("Jane");
        b1.setnumOfPage(24);
        b2.setTitle("Jo");
        b2.setnumOfPage(24);
        isMorePages(b2);
        System.out.println(compareBook(b1,b2));
        System.out.println(b1.toString());
    }
    
}
