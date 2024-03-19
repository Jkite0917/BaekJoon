package BaekJoon.단계별로풀어보기.문자열;

import java.util.Scanner;
public class B5_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int point = sc.nextInt();
        sc.close();

        String result = S.substring(point-1, point);
        System.out.println(result);
    }
}
