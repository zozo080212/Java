package hw1;

import java.util.Scanner;

public class FutureDate {
    public static void main(String[] args) {
        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter today’s day: ");
            int day = scanner.nextInt();

            System.out.println("Enter the number of days elapsed since today: ");
            int input = scanner.nextInt();
            int resultDay = (day + input) % 7;
            System.out.println("Today is " + days[day] + " and the future day is " + days[resultDay]);
        }
    }

