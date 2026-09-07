import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PrintAllDivisions {
    public static void printAllDiv( int num) {
        List<Integer> division = new ArrayList<>();
// Useing the o(n) TC and list
        for( int i = 1;i <= num; i++) {
            if (num % i == 0) {
                division.add(i);
        }

        System.out.println("Division of Num " + num + " are: " + division );
    }
}


// Using o(squr(n))

        public static void printSqDiv( int num) {
            List<Integer> div = new ArrayList<>();
            // here 1 * 1 <= 12 == true;
            //      4 * 4 <= 12 == false bz 4*4 is 16 which is grater then 12 so false
            for(int i = 1; i * i <= num; i++) {
                if(num % i == 0) {
                    div.add(i);

                    if(i != num / i) {
                        div.add(num / i);
                    }
                }
                Collections.sort(div);
                System.out.println(div);
            }
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
