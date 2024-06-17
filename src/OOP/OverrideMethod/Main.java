package OOP.OverrideMethod;
import java.util.Scanner;

class Person{
    final String master = "Master Card";
    final String visa = "Visa Card";
    double depositamt;
    String cardType;
    String name;
    String address;
    String email;
    int dob;
    int phone;
    int age ;
    int nid;

    Person(){

    }
    Person(String name, String address, String email, int dob, int phone, int age, int nid){
        this.name = name;
        this.address = address;
        this.email = email;
        this.dob = dob;
        this.phone = phone;
        this.age = age;
        this.nid = nid;
    }

    void PersonInput(Scanner input){
        System.out.println("Enter the name: ");
        name = input.nextLine();
        System.out.println("Enter date of birth: ");
        dob = input.nextInt();
        System.out.println("Enter the NID number: ");
        input.nextLine();
        nid = input.nextInt();
        input.nextLine();
        System.out.println("Enter the address: ");
        address = input.nextLine();
        System.out.println("Enter the phone number: ");
        phone = input.nextInt();
        input.nextLine();
        System.out.println("Enter the email: ");
        email = input.nextLine();
    }
    void ShowInfo(){
        System.out.println();
        System.out.println("<<<<<<<<<Cust INFO>>>>>>>>>");
        System.out.println("Name : "+name);
        System.out.println("DOB : "+dob);
        System.out.println("NID : "+nid);
        System.out.println("Address: "+address);
        System.out.println("Phone : "+phone);
        System.out.println("Email: "+ email);
    }
    double calculatInterest(double interest, double totalBal){
        return interest * totalBal;
    }
}
class UsdSaving extends Person{
    final double usdInterest = 0.05;
    UsdSaving(){

    }

    @Override
    void PersonInput(Scanner input){
        int opt;
        System.out.println("\n<<<<<<<<<<<<Create USD Saving Account>>>>>>>>>>>>");
        super.PersonInput(input);
        System.out.println("|||||||||||||||||||||||||||||");
        System.out.println("Choose your type of card: ");
        System.out.print(" 1. |Visa Card| <---> 2. |Master Card|\n");
        opt = input.nextInt();
        cardType = (opt == 1) ? visa : master;
        System.out.println("Enter the deposit amount to your account");
        depositamt = input.nextDouble();
    }
    @Override
    void ShowInfo(){
        super.ShowInfo();
        System.out.println("|||||||||||||||||||||||||||||");
        System.out.println("Card type : "+cardType);
        System.out.println("Working Balance: "+depositamt);
        System.out.println("Total interest income at the end of this year: "+super.calculatInterest(usdInterest,depositamt)+" $");
        System.out.println("\n---------Thank you for choosing Us---------");
    }
}

class KhrSaving extends Person{
    final double KhrInterest = 1.4;
    Person person = new Person();
    KhrSaving(){

    }
    @Override
    void PersonInput(Scanner input){
        int opt;
        System.out.println(1
        );
        System.out.println("<<<<<<<<<<<<Create KHR Saving Account>>>>>>>>>>>>");
        person.PersonInput(input);
        System.out.println("|||||||||||||||||||||||||||||");
        System.out.println("Choose your type of card: ");
        System.out.print(" 1. |Visa Card| <---> 2. |Master Card|\n");
        opt = input.nextInt();
        cardType = (opt == 1) ? visa : master;
        System.out.println("Enter the deposit amount to your account");
        depositamt = input.nextDouble();
    }
    @Override
    void ShowInfo(){
        super.ShowInfo();
        System.out.println("|||||||||||||||||||||||||||||");
        System.out.println("Card type : "+cardType);
        System.out.println("Working Balance: "+depositamt);
        System.out.println("Total interest income at the end of this year: "+super.calculatInterest(KhrInterest,depositamt)+" KHR");
        System.out.println("\n---------Thank you for choosing Us---------");
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UsdSaving createUsd = new UsdSaving();
        KhrSaving createKhr = new KhrSaving();
        System.out.println("\n<<<<<<<<<<Welcome to Create Account System>>>>>>>>>>");
        System.out.println("Please Enter your option Please : ");
        System.out.println("1. Create USD saving account");
        System.out.println("2. Create KHR saving account");
        System.out.println("3. Exit");
        int opt = input.nextInt();
        input.nextLine();
        switch (opt) {
            case 1:
                createUsd.PersonInput(input);
                createUsd.ShowInfo();
                break;
            case 2:
                createKhr.PersonInput(input);
                createKhr.ShowInfo();
            default:
                break;
        }
    }
}