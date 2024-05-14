package BaekJoon.배열;

import java.util.Scanner;
public class B5_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] list = new int[N];

        for(int i=0; i<N; i++) {
            list[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        sc.close();
        int count = 0;

        for(int i=0; i<N; i++) {
            if (list[i] == v) {
                count++;
            }
        }

        System.out.println(count);
    }
}
