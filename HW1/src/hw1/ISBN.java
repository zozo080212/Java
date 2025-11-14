package hw1;
import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string:  ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] inputArray = input.toCharArray();
        if (inputArray.length == 12) {
            int result = 10 - (Character.getNumericValue(inputArray[0]) + 3 * Character.getNumericValue(inputArray[1]) +
                    Character.getNumericValue(inputArray[2]) + 3 * Character.getNumericValue(inputArray[3]) +
                    Character.getNumericValue(inputArray[4]) + 3 * Character.getNumericValue(inputArray[5]) +
                    Character.getNumericValue(inputArray[6]) + 3 * Character.getNumericValue(inputArray[7]) +
                    Character.getNumericValue(inputArray[8]) + 3 * Character.getNumericValue(inputArray[9]) +
                    Character.getNumericValue(inputArray[10]) + 3 * Character.getNumericValue(inputArray[11])) % 10;
            System.out.println(input + result);
        } else {
            System.err.println("Invalid input. Please enter 12 digits.");
        }
    }
}


