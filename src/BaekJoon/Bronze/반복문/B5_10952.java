package BaekJoon.Bronze.반복문;

import java.util.Scanner;
public class B5_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if(A==0 && B==0) {
                break;
            }
            System.out.println((A+B));

        } while (true);
    }
}
