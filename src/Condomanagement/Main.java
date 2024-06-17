package Condomanagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opt = 0;
        Scanner input = new Scanner(System.in);
        SettingCondo setCondo = new SettingCondo();
        setCondo.defloor = 5;
        setCondo.SetCondo();
        do {

            System.out.println("1.Buy Condo");
            System.out.println("2.Sell Condo");
            System.out.println("3.Show Condo Information");
            System.out.println("4.Search Information");
            System.out.println("5.Exit");
            System.out.println("Please Enter from 1 to 5\n");
            opt = input.nextInt();
            setCondo.Menu(opt);
        }while(opt!=5);
    }

}
