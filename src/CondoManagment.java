import java.util.Scanner;

public class CondoManagment {
    public static void main(String[] args) {
        System.out.println("<==========Condo Management System==========>");
        try (Scanner input = new Scanner(System.in)) {
            int opt = 0;
            int floor = 0;
            int deroom;
            int defloor;
            String owner;
            int room = 0;
            String ownerName;
            boolean isTrue = false;

            System.out.println("<=====Setting Up condo=====>");
            System.out.println("Enter floor : ");
            floor = input.nextInt();
            System.out.println("Enter room number: ");
            room = input.nextInt();
            String[][] condo = new String[floor][room];

            System.out.println("!!!!!Successfully Setting up!!!!!");
            System.out.println("There : "+floor+" floors");
            System.out.println("Total room are "+(floor*room)+" rooms");
            do {
                System.out.println("1.Buy Condo");
                System.out.println("2.Sell Condo");
                System.out.println("3.Show Condo Information");
                System.out.println("4.Search Information");
                System.out.println("5.Exit");
                opt = input.nextInt();
                input.nextLine();
                switch (opt) {
                    case 1 : {
                        System.out.println("Buy Condo");
                        System.out.println("Enter the floor : ");
                        defloor = input.nextInt();
                        for (int i = 1; i <= floor; i++) {
                            if (i == defloor) {
                                isTrue = true;
                                break;
                            }
                        }
                        if (!isTrue) {
                            System.out.println("There no that floor number");
                            break;
                        }
                        System.out.println("Enter the room : ");
                        deroom = input.nextInt();
                        isTrue = false;
                        for (int j = 1; j <= room; j++) {
                            if (j == deroom) {
                                isTrue = true;
                                break;
                            }
                        }
                        if (!isTrue) {
                            System.out.println("There no that room number");
                            break;
                        }
                        if (condo[defloor - 1][deroom - 1] != null) {
                            System.out.println("This room already Sold");
                            break;
                        }
                        input.nextLine();
                        System.out.println("Enter Owner name: ");
                        ownerName = input.nextLine();
                        //set owner to condo
                        condo[defloor - 1][deroom - 1] = ownerName;
                        System.out.println();
                        System.out.println("!!!!!Successfully buying new Condo!!!!");
                    }
                    case 2 : {
                        System.out.println("Sell the condo");
                        System.out.println("Enter Your Condo room floor: ");
                        defloor = input.nextInt();
                        System.out.println("Enter your condo room number: ");
                        deroom = input.nextInt();
                        if (defloor > floor || deroom > room) {
                            System.out.println("There no that floor or room");
                            break;
                        }
                        if (condo[defloor - 1][deroom - 1] == null) {
                            System.out.println("Connot sell this condo");
                        } else {
                            ownerName = condo[defloor - 1][deroom - 1];
                            System.out.println("Enter the owner name to verify: ");
                            owner = input.nextLine();
                            input.nextLine();
                            if (owner.equals(ownerName)) {
                                condo[defloor - 1][deroom - 1] = null;
                                System.out.println("You Sell you condo Successful");
                            } else {
                                System.out.println("You Enter wrong name");
                            }

                        }
                    }
                    case 3 : {
                        System.out.println("Information of Condo");
                        for (int i = 0; i < condo.length; i++) {
                            System.out.print("floor " + (i + 1) + " : ");
                            for (int j = 0; j < condo[i].length; j++) {
                                System.out.print(" " + condo[i][j]);
                            }
                            System.out.println();
                        }
                    }
                    case 4 : {
                        int seacrhopt;
                        System.out.println("Search Condo");
                        System.out.println("1. Search by Floor Number ");
                        System.out.println("2. Search by Room and Fool ");
                        System.out.println("3. Search by Owner Name");
                        seacrhopt = input.nextInt();
                        switch (seacrhopt) {
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
                            }
                            case 2 : {
                                System.out.println("Search by Room and Floor");
                                System.out.println("Enter your Floor: ");
                                defloor = input.nextInt();
                                System.out.println("Enter your Room: ");
                                deroom = input.nextInt();
                                if (defloor > floor || deroom > room) {
                                    System.out.println("There no that floor or room number in our building");
                                }
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
                            case 3 : {
                                System.out.println("Search by Owner name");
                                ownerName = input.nextLine();
                                isTrue = false;
                                for (int i = 0; i < condo.length; i++) {
                                    for (int j = 0; j < condo[i].length; j++) {
                                        if (ownerName.equals(condo[i][j])) {
                                            System.out.println("Owner Name : " + condo[i][j]);
                                            System.out.println("Floor number: " + (i + 1));
                                            System.out.println("Room number : " + (j + 1));
                                            isTrue = true;
                                        }
                                    }
                                }
                            }
                            default : {
                                break; 
                            }
                        }
                        if (!isTrue) {
                            System.out.println("There no owner with that name here");
                        }
                        System.out.println();
                    }
                    default : {
                        break; 
                    }
                }
            }while (opt != 5);
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
