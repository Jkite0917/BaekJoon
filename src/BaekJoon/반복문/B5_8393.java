package BaekJoon.반복문;

import java.util.Scanner;
public class B5_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += 1+i;
        }
        System.out.println(sum);
    }
}
