package BaekJoon.Sliver;

import java.util.Scanner;

public class S1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        double Z = Math.floor(Y * 100.0 / X);

        if (Z >= 99) {
            System.out.println(-1);
        } else {
            double n = Math.ceil((X*Z+Z-100*Y) / (99-Z));
            int result = (int) n;
            System.out.println(result);
        }
    }
}
        /*
        (Z + 1) = (Y + n) * 100 / (X + n);
        ==> n = (XZ+X-100Y) / (99-Z)
        */
