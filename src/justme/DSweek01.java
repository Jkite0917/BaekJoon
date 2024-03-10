package justme;
import java.util.Scanner;

public class DSweek01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input numebr : ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " is not a prime number.");
        } else {
            boolean isPrime = true;

            for(int i=2; i*i<=number; i++) { // i <= Math.sqrt(number);
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}
