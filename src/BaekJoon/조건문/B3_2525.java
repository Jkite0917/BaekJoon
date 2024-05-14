package BaekJoon.조건문;

import java.util.Scanner;

public class B3_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int num4 = num2 + num3;

        if (num4 >= 60) {
            num1 += num4 / 60;
            num4 = num4 % 60;
            if (num1 >= 24) {
                num1 -= 24;
            }
        }
        System.out.println(num1+" "+num4);
    }
}
