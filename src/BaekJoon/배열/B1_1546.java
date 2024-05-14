package BaekJoon.배열;

import java.util.Scanner;
public class B1_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] scores = new int[count];

        int max = 0;
        for(int i=0; i<count; i++) {
            scores[i] = sc.nextInt();
            if(scores[i] > max) {
                max = scores[i];
            }
        }
        sc.close();

        double result = 0.0;
        for(int i=0; i<count; i++) {
            result += (scores[i] / (double)max * 100);
        }
        System.out.println(result/count);

    }
}

