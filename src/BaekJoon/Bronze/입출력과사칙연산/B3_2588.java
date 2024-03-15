package BaekJoon.Bronze.입출력과사칙연산;

import java.util.Scanner;
public class B3_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int d = B / 100;
        int e = (B % 100) / 10;
        int c = ((B%100)%10);

        System.out.println(A*c);
        System.out.println(A*e);
        System.out.println(A*d);
        System.out.println(A*B);
    }
}