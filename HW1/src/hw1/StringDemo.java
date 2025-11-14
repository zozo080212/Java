package hw1;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("the string is ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        int Lettercount = 0;
        int Spacecount = 0;
        int other=0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
                }else if (Character.isLetter(ch)) {
                Lettercount++;
            } else if (Character.isSpaceChar(ch)) {
                Spacecount++;
            } else {
                other++;
            }
        }
        System.out.println("Sum of digits: " + count);
        System.out.println("Sum of letters: " + Lettercount);
        System.out.println("Sum of spaces: " + Spacecount);
        System.out.println("Sum of other characters: " + other);
    }
}



