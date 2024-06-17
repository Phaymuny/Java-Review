package Condomanagement;
import java.util.Scanner;

public class SettingCondo {
    Scanner input = new Scanner(System.in);
    int floor;
    String owner;
    int room;
    int defloor;
    int deroom;
    String[][] condo;

    //ArrayList<ArrayList<Integer>> condo = new ArrayList<ArrayList<Integer>>();
    SettingCondo() {

    }

    void SetCondo() {
        System.out.println("<=====Setting Up condo=====>");
        System.out.println("Enter floor : ");
        floor = input.nextInt();
        System.out.println("Enter room number: ");
        room = input.nextInt();
        System.out.println("!!!!!Successfully Setting up!!!!!");
        System.out.println("There : " + floor + " floors");
        System.out.println("Total room are " + (floor * room) + " rooms");
        condo = new String[floor][room];
        System.out.println();
    }

    void Menu(int opt) {
        switch (opt) {
            case 1:
                while (opt != 5) {
                    System.out.println("=======Menu Buy Condo=======");
                    System.out.println("Enter Your Prefer Floor: ");
                    defloor = input.nextInt();
                    System.out.println("Enter Your Prefer Room : ");
                    deroom = input.nextInt();
                    if (defloor > floor || deroom > room) {
                        System.out.println("You Enter wrong floor or room number");
                        System.out.println("Please Enter 1 to redo or 5 quite : ");
                        opt = input.nextInt();
                    } else if (condo[defloor - 1][deroom - 1] != null) {
                        System.out.println("The room already sold");
                        System.out.println("Please Enter 1 to redo or 5 quite : ");
                        opt = input.nextInt();
                    } else {
                        input.nextLine();
                        System.out.println("Enter Owner name: ");
                        owner = input.nextLine();
                        //set owner to condo
                        condo[defloor - 1][deroom - 1] = owner;
                        System.out.println();
                        System.out.println("!!!!!Successfully buying new Condo!!!!");
                        opt = 5;
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("=======Sell Condo=======");
                System.out.println("Enter Your Condo room floor: ");
                defloor = input.nextInt();
                System.out.println("Enter your condo room number: ");
                deroom = input.nextInt();
                if (defloor > floor || deroom > room) {
                    System.out.println("There no that floor or room");
                    break;
                }
                if (condo[defloor - 1][deroom - 1] == null) {
                    System.out.println("Cannot sell this condo");
                } else {
                    input.nextLine();
                    System.out.println("Enter the owner name to verify: ");
                    owner = input.nextLine();
                    if (owner.equals(condo[defloor - 1][deroom - 1])) {
                        condo[defloor - 1][deroom - 1] = null;
                        System.out.println("You Sell you condo Successful");
                    } else {
                        System.out.println("You Enter wrong name");
                    }
                }
                break;
            case 3:
                System.out.println("==========Information of Condo==========");
                for (int i = 0; i < condo.length; i++) {
                    System.out.print("floor " + (i + 1) + " : ");
                    for (int j = 0; j < condo[i].length; j++) {
                        System.out.print(" " + condo[i][j]);
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Search Condo");
                System.out.println("1. Search by Floor Number ");
                System.out.println("2. Search by Room and Fool ");
                System.out.println("3. Search by Owner Name");
                opt = input.nextInt();
                switch (opt) {
                    case 1 : {
                        System.out.println("Search by Floor Number: ");
                        System.out.println("Enter by floor");
                        defloor = input.nextInt();
                        if (defloor > condo.length) {
                            System.out.println("You Enter the wrong floor");
                            break;
                        }
                        for (int i = 0; i < condo[defloor - 1].length; i++) {
                            System.out.print(" " + (condo[defloor - 1][i]));
                        }
                        System.out.println();
                    }
                    case 2 : {
                        System.out.println("Search by Room and Floor");
                        System.out.println("Enter your Floor: ");
                        defloor = input.nextInt();
                        System.out.println("Enter your Room: ");
                        deroom = input.nextInt();
                        if (defloor > floor || deroom > room) {
                            System.out.println("There no that floor or room number in our building");
                        } else {
                            for (int i = 0; i < condo[defloor - 1].length; i++) {
                                if (condo[defloor - 1][deroom - 1] != null) {
                                    if (condo[defloor - 1][i].equals(condo[defloor - 1][deroom - 1])) {
                                        System.out.println("Owner Name : " + condo[defloor - 1][deroom - 1]);
                                        System.out.println("Floor number: " + (defloor));
                                        System.out.println("Room number : " + (deroom));
                                    }
                                } else {
                                    System.out.println("Owner Name : " + condo[defloor - 1][i]);
                                    System.out.println("Floor number: " + (defloor));
                                    System.out.println("Room number : " + (i + 1));
                                }
                            }
                        }
                    }
                    default : {
                    }
                }
            default:
                break;
        }
    }
}
