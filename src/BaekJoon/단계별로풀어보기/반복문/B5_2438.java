package BaekJoon.단계별로풀어보기.반복문;

import java.util.Scanner;
public class B5_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++) {
            for(int j=1; j<=i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
