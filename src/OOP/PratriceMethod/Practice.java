package OOP.PratriceMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.println("Enter number 3: ");
        int num3 = input.nextInt();
        int biggest = findSmallestNum(num1, num2, num3);
        System.out.println("Enter String : ");
        String fullStr = input.next();
        System.out.println("biggest number is :" + biggest);
        System.out.println("Average Number : " + findAverageNumber(num1, num2, num3));
        System.out.println("Char in middle is " + findMiddllString(fullStr));
        System.out.println("Number of  Vowels in the string: " + countvowels(fullStr));
        System.out.println("Enter String to count space : ");
        input.next();
        fullStr = input.nextLine();
        System.out.println("Space in this String : " + countSpace(fullStr));
        System.out.println("Sum degits of "+num3+" = "+countDegitOfNumer(num3));
    }

    static int findSmallestNum(int num1, int num2, int num3) {

        // find biggest number using ArrayList
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(num1);
        numList.add(num2);
        numList.add(num3);
        int bigNum = numList.stream().sorted(Comparator.reverseOrder())
                .findFirst()
                .orElse(null);

        // find smallest use tranditional loop
        int[] allNum = new int[3];
        allNum[0] = num1;
        allNum[1] = num2;
        allNum[2] = num3;
        int smallest = Integer.MAX_VALUE;
        for (int i : allNum) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return bigNum;
    }

    static int findAverageNumber(int num1, int num2, int num3) {

        int[] numList = new int[3];
        numList[0] = num1;
        numList[1] = num2;
        numList[2] = num3;
        int averageNum = 0;
        for (int i : numList) {
            averageNum += i;
        }
        return averageNum / 3;
    }

    static String findMiddllString(String fullString) {
        int strLeghth = fullString.length();
        String newStr = "";
        System.out.println(newStr);
        System.out.println(strLeghth);
        if (strLeghth % 2 == 0) {
            newStr = String.valueOf(fullString.charAt(strLeghth / 2 - 1))
                    + String.valueOf(fullString.charAt(strLeghth / 2));
        } else {
            newStr = String.valueOf(fullString.charAt((int) strLeghth / 2));
        }
        return newStr;
    }

    static int countvowels(String vowels) {

        List<String> vowel = Arrays.asList("a", "e", "i", "o", "u");
        int length = vowels.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            for (String string : vowel) {
                if (String.valueOf(vowels.charAt(i)).equals(string)) {
                    count += 1;
                }
            }
        }
        return count;
    }

    static int countSpace(String str) {

        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        /*
          int spaceCount = (int) str.chars()
          .filter(ch -> ch == ' ')
          .count();
         */
        return spaceCount;
    }

    static int countDegitOfNumer(int digits){
        String nums = String.valueOf(digits); 
        System.out.println("count : "+ nums);
        int length = nums.length(); 
        int countDegits = 0; 
        /* for(int i =0; i<length; i++){
            int eachDigit = Character.getNumericValue(nums.charAt(i));
            System.out.println("Each digit: " + eachDigit);
            countDegits += eachDigit; 
        } */

        while (digits!=0) {
            countDegits += digits % 10;
            System.out.println("Result of % 10 = "+ digits % 10);
            int newVal = digits/=10; 
            System.out.println("Deduct 1 degit : "+ newVal);
            digits/=10; 
        }
        return countDegits; 
    }
}
