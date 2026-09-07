import java.util.Scanner;

public class PrimNum {
    public static boolean checkPrim( int num ) {
        for(int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Integer: ");
        if(sc.hasNextInt()) {
            int num = sc.nextInt();

            if(checkPrim(num)){
                System.out.println("The num "+ num + " is the prime number");
            }else{
                System.out.println("is not a prime number");
            }
        }
        sc.close();
    }
}
