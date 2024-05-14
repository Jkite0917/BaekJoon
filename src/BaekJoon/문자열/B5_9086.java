package BaekJoon.문자열;

import java.util.Scanner;
public class B5_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());

        String result[] = new String[T];
        for(int i=0; i<T; i++) {
            String str = sc.nextLine();
            result[i] = str.substring(0,1) + str.substring(str.length()-1, str.length());
        }
        sc.close();

        for(int i=0; i<T; i++) {
            System.out.println(result[i]);
        }
    }
}
