package BaekJoon.단계별로풀어보기.배열;

import java.util.Scanner;
public class B5_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int X = sc.nextInt();

        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
            if (A[i] < X) {
                System.out.print(A[i]+" ");
            }
        }
        sc.close();
    }
}
