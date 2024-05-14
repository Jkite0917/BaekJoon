package BaekJoon.심화;

import java.util.Scanner;
public class B3_2444 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        for(int i=0; i<N; i++) {
            for(int n=0; n<N-(i+1); n++) {
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=N-1; i>0; i--) {
            for(int j=0; j<N-i; j++) {
                System.out.print(" ");
            }
            for(int n=0; n<2*i-1; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// 4-1 , 3-2, 2-3, 1-4
