import java.util.Scanner;

public class Digit_Count {

    // using the  digit Extraction;
    public static int countDigit(int num) {
        num = Math.abs(num);
        int count = 0;
        while(num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    // using the log10;
    public static int countDigitLog(int num) {
        num = Math.abs(num);
        int count = (int)(Math.log10(num) + 1);
        return count;
    }

    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if(!sc.hasNextInt()){
            System.out.print("Enter a vaid number: ");
            sc.close();
            return;
        }

        int number = sc.nextInt();
        // int digit = countDigit(number);
        int digit = countDigitLog(number);

        System.out.println("Number of digits are: "+ digit);
        sc.close();

    }
}
