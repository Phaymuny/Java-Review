public class Main {

    private final static TestClass testClass = new TestClass();
    private final static TakeTestClass takeTestClass = new TakeTestClass(); 

    int min(int x,int y){
        return x < y ? x : y;
    }
    static int[] array = {1,5,3,8,9};
    public static void main(String[] args) {
       
       System.out.println("Hello");
       
       testClass.testTeller();
       
       System.out.println("call take test class");
       
       takeTestClass.takeTestClass().haha();

    }
}