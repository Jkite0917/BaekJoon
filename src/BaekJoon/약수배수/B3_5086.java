package BaekJoon.약수배수;

import java.util.Scanner;
public class B3_5086 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true) {
            int A = input.nextInt();
            int B = input.nextInt();
            if(A == 0 && B == 0) {
                break;
            }
            if(A>B && A%B==0) {
                System.out.println("multiple");
            } else if (A<B && B%A==0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }
        }
    }
}
