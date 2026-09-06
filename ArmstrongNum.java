import java.util.Scanner;

public class ArmstrongNum {
    public static boolean armstrongNum( int num){
        int dup = num;
        int sum = 0;

        while (num > 0) {
            int lg= num % 10;
            sum = sum + (lg * lg * lg);
            num = num /10;
        }

            return dup == sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();

            if (armstrongNum(number)) {
                System.out.println(number + " is a Armstrong number.");
            } else {
                System.out.println(number + " is NOT a Armstrong number.");
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        sc.close();
    }
}
