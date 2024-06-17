package lampada;

/*funtional interface*/
/*is interface that only one abstract method*/
/*lampda will only work with functional interface*/
@FunctionalInterface
interface IFeacture{
    //void login();
    void login(String name,int pass);
}

interface Isum{
    float sum(float a , float b);
}
/*inheritance*/
public class Main {
    public static void main(String[] args) {

       /*IFeacture obj = new IFeacture() {
            @Override
            public void login() {
                System.out.println("This is login");
            }
        };*/
        //IFeacture obj2 = () -> System.out.println("this login method using lampda");
        //using lampda expression with parameters; 
        IFeacture obj2 = (name,pass) -> {
            System.out.println("this login " + name);
            System.out.println("this is password "+pass);
        };
        //obj.login();
        obj2.login("Mr. KaKa",111);
        //lampda using with return type :
         Isum obj = (a,b)-> {
            System.out.println("Sum is working");
            return a + b;
        };
        Isum obj1 = (i,j)->i+j;
        System.out.println(obj1.sum(10f, 80f));

        float result = obj.sum(20,30);
        System.out.println("Value of result is : "+result);
    }
}