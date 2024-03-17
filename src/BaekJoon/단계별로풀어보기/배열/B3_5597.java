package BaekJoon.단계별로풀어보기.배열;

import java.util.Scanner;
public class B3_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] studentNumber = new int[30];
        for(int i=0; i<studentNumber.length; i++) {
            studentNumber[i] = i+1;
        }

        int[] submitSN = new int[28];
        for(int i=0; i<28; i++) {
            submitSN[i] = sc.nextInt();
            for(int j=0; j<30; j++) {
                if(submitSN[i] == studentNumber[j]) {
                    studentNumber[j] = 0;
                }
            }
        }
        sc.close();

        int[] notSubmit = new int[2];
        for(int i=0, j=0; i<30; i++) {
            if(studentNumber[i] != 0) {
                notSubmit[j] = studentNumber[i];
                j++;
            }
        }

        System.out.println((notSubmit[0]>notSubmit[1]) ? notSubmit[1]+"\n"+notSubmit[0] : notSubmit[0]+"\n"+notSubmit[1]);
    }
}
