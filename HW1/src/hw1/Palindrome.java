package hw1;
public class Palindrome {
    public static void main(String[] args) {
        int count = 0;
        int integer = 2;
        while (count < 100) {
            boolean isPrime = true;


            if (integer < 2) {
                isPrime = false;
            } else {
                for (int multiple = 2; multiple * multiple <= integer; multiple++) {
                    if (integer % multiple == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            int origin = integer;
            int reverse = 0;
            int temp = integer;
            while (temp > 0) {
                int remainder = temp % 10;
                reverse = reverse * 10 + remainder;
                temp = temp / 10;
            }
            boolean isPalindrome = (origin == reverse);
            if (isPrime && isPalindrome) {
                System.out.println(integer);
                count++;

            }
            integer++;
        }
    }
}






