package BaekJoon.Bronze.반복문;

import java.util.Scanner;
public class B4_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1; i<=N; i++) {
            for(int j=(N-i); j>0; j--) {
                System.out.print(" ");
            }
            for(int o=1; o<=i; o++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
