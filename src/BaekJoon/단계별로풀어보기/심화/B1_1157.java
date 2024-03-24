package BaekJoon.단계별로풀어보기.심화;

import java.util.Scanner;
public class B1_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toUpperCase().toCharArray();
        sc.close();

        int[] count = new int[26];

        for(int i=0; i<input.length; i++) {
            int tmp = input[i];
            count[tmp-'A'] += 1;
        }

        int max = 0;
        char ch = '?';

        for(int i=0; i<26; i++) {
            if(count[i] > max) {
                max = count[i];
                ch = (char) (i + 65);
            } else if (count[i] == max) {
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}

/*
Scanner sc = new Scanner(System.in);
        char[] as = sc.nextLine().toCharArray();
        sc.close();
        int[] count = new int[as.length];

        for(int i=0; i<as.length; i++) {
            as[i] = Character.toUpperCase(as[i]);
            count[i] = 1;
        }

        for(int i=0; i<as.length; i++) {
            for(int j=0; j<i; j++) {
                if (as[i] == as[j] && as[j] != 0) {
                    count[j] += 1;
                    count[i] = 0;
                    as[i] = 0;
                }
            }
        }

        int max=0; int index=0;
        for(int i=0; i<count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                index = i;
            }
        }
        int duplication = 0;
        for(int i=0; i<count.length; i++) {
            if (max == count[i]) {
                duplication += 1;
            }
        }

        System.out.println((duplication > 1) ? "?" : as[index]);
    }
 */
