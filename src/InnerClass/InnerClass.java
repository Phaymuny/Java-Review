package InnerClass;

class A
{
    int age; 
    public void show(){
        System.out.println("Old show");
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("New Show");
            }
        }; 
        obj.show();
    }
}
