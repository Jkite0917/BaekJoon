package BaekJoon.심화;

import java.util.Scanner;
public class B3_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] as = sc.nextLine().toCharArray();
        sc.close();
        int result=1;

        for(int i=0, j=1; i<as.length; i++, j++) {
            if(i >= as.length-j) {
                break;
            }
            if (as[i] != as[as.length-j]) {
                result = 0;
            }
        }
        System.out.println(result);
    }
}
