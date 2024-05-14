package BaekJoon.조건문;

import java.util.Scanner;

public class B3_2884 {
    // 단계별 - 조건문
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = 60 - (45-num2);

        if(num1 == 0 && num2 < 45) {
            System.out.println(23+" "+num3);
        } else if (num2 < 45) {
            System.out.println(num1-1+" "+num3);
        } else {
            num3 = num2 - 45;
            System.out.println(num1+" "+num3);
        }
    }
}
