public class TryException {
    public static void main(String[] args) {

        //try and catch is use to execute code and try to catch the error with catch

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println(e);
        }
        //finally is uses to keep on running after the catch
        finally {
            System.out.println("The 'try catch' is finished.");
        }
        //Throw is uses to throw the custom error message to user when some case
        int i = 90;
        if (i>10){
            throw new ArithmeticException("Your number i is too big");
        }
        //


    }
}
