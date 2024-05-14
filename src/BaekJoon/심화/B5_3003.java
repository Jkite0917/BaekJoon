package BaekJoon.심화;

import java.util.Scanner;
public class B5_3003 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8};

        int[] need = new int[chess.length];

        for(int i=0; i<chess.length; i++) {
            int count = in.nextInt();
            need[i] = chess[i] - count;
        }
        in.close();

        for(int i=0; i<need.length; i++) {
            System.out.print(need[i]+" ");
        }
    }
}
