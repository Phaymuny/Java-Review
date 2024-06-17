package Interface;


class laptop{
    public void code(){
        System.out.println("Code compile ");
    }
}

//interface like a class but all method automatically abstract 
//interface 

class Developer{
    public void devApp(){
        System.out.println("Coding");
    }
}

interface A{
    void show(); 
    void config(); 
    //all varible in interface is automatically static of final. 
    //So you need to initaily value to it first. 
    int age = 19; 
    String name = "Hong"; 
}

interface X{
    void run(); 
}

class B implements A,X{
    public void show(){
        System.out.println("This show");
    }
    public void config(){
        System.out.println("This is config");
    }
    public void run(){
        System.out.println("Keep on runnin ");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Developer developer = new Developer(); 
        developer.devApp();
        B obj = new B();
        obj.show();
        obj.config();

        //Because it static of final it mean you can access it without needed of object. 
        //Like below: 
        System.out.println(A.name);
        System.out.println(A.age);
        
        //You can not resign the value to that again after you initailize value to it. 
        /* A.name = "Sasa"; */
    }
}
