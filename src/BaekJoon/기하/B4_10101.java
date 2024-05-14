package BaekJoon.기하;

import java.util.Scanner;
public class B4_10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int value = A + B + C;

        if(value != 180) {
            System.out.println("Error");
        } else if (A != B && A != C && B != C) {
            System.out.println("Scalene");
        } else if (A == B && B == C && A == 60) {
            System.out.println("Equilateral");
        } else if ( (A == B && B != C) || (A == C && A != B) || (B == C && B != A)) {
            System.out.println("Isosceles");
        }
    }
}
