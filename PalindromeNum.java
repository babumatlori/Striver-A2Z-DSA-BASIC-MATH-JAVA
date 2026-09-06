import java.util.Scanner;

public class PalindromeNum {

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;

        // Handle negative numbers (not considered palindrome here)
        if (num < 0) {
            return false;
        }

        while (num > 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();

            if (isPalindrome(number)) {
                System.out.println(number + " is a Palindrome number.");
            } else {
                System.out.println(number + " is NOT a Palindrome number.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        sc.close();
    }
}
