import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisions {
    public static void printAllDiv( int num) {
        List<Integer> division = new ArrayList<>();

        for( int i = 1; i <= num; i++) {
            if (num % i == 0) {
                division.add(i);
            }
        }

        System.out.println("Division of Num " + num + " are: " + division );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        if (sc.hasNextInt()) {
            int div = sc.nextInt();
            printAllDiv(div);

        }
        else {
            System.out.println("Invalid input. Please enter an integer.");
        }


        sc.close();
    }
}
