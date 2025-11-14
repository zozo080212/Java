package hw1;
import java.util.Scanner;

public class Markov {
    public static boolean isMarkovMatrix(double[][] matrix) {
        for (int j = 0; j < 3; j++) {
            double columnSum = 0;
            for (int i = 0; i < 3; i++) {
                columnSum += matrix[i][j];
                if (matrix[i][j] < 0) {
                    return false;
                }
            }
            if (columnSum != 1.0) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[]args){
            System.out.println("Enter a 3-by-3 matrix row by row (separate values by spaces): ");
            Scanner scanner = new Scanner(System.in);
            double[][] inputArray = new double[3][3];
            for (int i = 0; i < 3; i++) {
                String input = scanner.nextLine();
                String[] rows = input.split(" ");
                for (int j = 0; j < 3; j++) {
                    inputArray[i][j] = Double.parseDouble(rows[j]);
                }
            }
            boolean isMarkov = isMarkovMatrix(inputArray);

            if (isMarkov) {
                System.out.println("The matrix is a Markov matrix.");
            } else {
                System.out.println("The matrix is NOT a Markov matrix.");
            }

            scanner.close();
        }
    }




