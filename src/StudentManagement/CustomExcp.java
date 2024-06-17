package StudentManagement;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CustomExcp {
    public static int readInt(String message, Scanner input) {
        int val;
        while (true) {
            try {
                System.out.println(message);
                val = input.nextInt();

                if(message.equals("Enter Student ID (4 digits) : ")){
                    //int count = countDigit(val);
                    int count = String.valueOf(val).length(); 
                    if (count !=4) throw new Exception("Student must have 4 digits");
                }
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Error>> Value must be a number!!");
                input.nextLine();
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return val;
    }
   /* public static int countDigit(int n){
        int count;
        if (n /10 != 0) {
            count = 1 + countDigit(n / 10);
        } else {
            count = 1;
        }
        return count;
    }*/
    public static float readfloat(String message, Scanner input){
        float val;
        while (true) {
            try {
                System.out.println("-----------");
                System.out.print(message+" ");
                val = input.nextFloat();
                break;
            } catch (InputMismatchException ex) {
                System.out.println("Error>> Value must be a number!!");
                input.nextLine();
            }
        }
        return val;
    }
    public static String readString(String message, Scanner input){
        String val;
        while (true){
            try{
                System.out.println(message);
                val = input.nextLine();
                if(!val.matches("[a-zA-Z]+")){
                    throw new Exception("Input must be Character");
                }
                break;
            }catch (Exception ex){
                System.out.println(ex);
            }
        }
        return val;
    }
}
