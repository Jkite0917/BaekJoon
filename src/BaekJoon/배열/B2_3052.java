package BaekJoon.배열;

import java.util.Scanner;
public class B2_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] remain = new int[10];
        for(int i=0; i<10; i++) {
            int A = sc.nextInt();
            if (A < 42) {
                remain[i] = A;
            } else{
                remain[i] = A % 42;
            }
        }
        sc.close();

        int count = 0;
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                if(remain[i] == remain[j] ) {
                    if (i == j) {
                        continue;
                    } else {
                        remain[i] = 42;
                    }
                }
            }

            if(remain[i] != 42) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
