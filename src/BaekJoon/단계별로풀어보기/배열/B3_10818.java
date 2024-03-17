package BaekJoon.단계별로풀어보기.배열;

import java.util.Scanner;
public class B3_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] list = new int[N];

        for(int i=0; i<N; i++) {
            list[i] = sc.nextInt();
        }
        sc.close();

        int max = list[0]; int min = list[0];
        for(int i=0; i<N; i++) {
            if (list[i] > max) {
                max = list[i];
            }
            if (list[i] < min) {
                min = list[i];
            }
        }
        System.out.println(min+" "+max);
    }
}
