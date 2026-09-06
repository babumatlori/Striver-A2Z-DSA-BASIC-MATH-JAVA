import java.util.Scanner;

public class ReverseNum {
    public static int reversNum( int num) {
        int reverse = 0;

        while( num != 0) { //when we want negative num to be also reverse if not then can use while(num > 0)
            int lastDigit = num % 10;

            reverse = (reverse * 10) + lastDigit;
            num = num / 10;
        }

            return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter nums for reverse: ");
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            int reverse = reversNum(num);
            System.out.println("Reverse Nums are: " + reverse);
        }

        sc.close();


    }
}
