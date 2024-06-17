package StudentManagment;

import java.util.Scanner;

public class CheckExp {
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
