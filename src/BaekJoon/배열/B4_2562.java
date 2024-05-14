package BaekJoon.배열;

import java.util.Scanner;
public class B4_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list  = new int[9];
        int max = 0; int line =0;

        for(int i=0; i<list.length; i++) {
            list[i] = sc.nextInt();
            if (list[i] > max) {
                max = list[i];
                line = i+1;
            }
        }
        sc.close();

        System.out.println(max+"\n"+line);
    }
}
