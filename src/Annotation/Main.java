package Annotation; 

/**
 * Main
 */

 class A{
    public void show(){
        System.out.println("in A show");
    }
 }
 class B extends A{
    @Override
    public void show() {
        System.out.println("in B show");
    }
 }
//Annotation : 
public class Main {
    public static void main(String[] args) {
        B obj = new B(); 
        obj.show();
        
    }
}