package BaekJoon.문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class B2_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().trim();
        sc.close();

        StringTokenizer st = new StringTokenizer(text, " ");
        System.out.println(st.countTokens());
    }
}
/*
     trim 이나 strip 으로  앞 뒤 공백을 지운다 해도,
     원래 입력이 공백 " " 이라면 해당 값은 빈 문자열 "" 이 된다.

     거기서 split(" ") 을 사용하는데,  split 은 입력값으로 구분지을 수 없을 경우
     => 입력값으로 공백을 넣엇으나 분리할 값에 공백이 없음.
     배열의 [0]에 빈 문자열로 값 하나가 반환된다.

     고로 split 을 사용할 때 해당 문제가 틀렸엇다는건
     빈 문자열인지 확인하여 빈 문자열은 0을 출력하는 예외처리를 해야한다.
*/
