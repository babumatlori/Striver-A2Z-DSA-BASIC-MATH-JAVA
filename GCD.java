import java.util.Scanner;

public class GCD {

        public static int gcd(int a, int b){
            while( b != 0) {
                int rem = a % b;
                a = b;
                b = rem;
            }
            return a;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter two numbers: ");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                int num2 = sc.nextInt();
                int result = gcd(num, num2);
                System.out.println(result);
            }

            sc.close();
        }
}
