package WhatsJava.배열;
import java.util.*;

public class array {
    public static void main(String[] args) {
        System.out.println("test");

        // 배열 선언
        int[] score;
        String[] name;

//        // 배열 선언 2
//        int score[];
//        String name[];        // ( 타입[] 변수명 or 타입 변수명[] )

        // 배열 생성
        int[] num;
        num = new int[4];   // 배열명 = new 타입[길이];

        // 한줄 생성
        int[] number = new int[4];  // 자동적으로 타입의 기본값으로 초기화

        // index
        // 0부터 n-1까지   (다른언어와 똑같음)
        int i = 1;
        num[0] = 10;
        num[i] = 20;   // 인덱스 번호에 변수 활용도 가능.

        // length 길이
        int[] arr = new int[0];    // 배열의 길이는 한번 생성하면 변경이 불가능하다.
        int tmp = arr.length;      // ==> 배열명.length 는 상수이다.   tmp = 0
        for(int j=0; j<arr.length; i++) {
            //  조건식 길이를 arr.length로 바꾸는 방법도 있다.
        }

        // 배열 길이 변경 방법
        // 1. 더 배열을 새로 만들고 기존 내용을 복사한다.
        // => 새로 만들어서 기존거 넣기

        // 배열의 초기화
        int[] scorenum = new int[5];
        scorenum[0]=0;
        scorenum[1]=1;
        //....[4]=4;       // 인덱스를 이용해서 하나하나의 공간에 값을 초기화(저장)

        // 간단한 방법
        int[] numscore = new int[] {0, 1, 2, 3, 4};
        // {}괄호 안의 내용을 보고 자동으로 길이를 측정하므로, []안에 길이를 입력하지 않아도 된다.

        // 생략 버전
        int[] s = {1, 2, 3};

        int[] d;
        d = new int[] {1, 2, 3};  // 선언과 생성을 따로 하는 경우, 배열명 = new 타입[] {} , new 타입[]은 생략이 불가능하다.

//        // 메서드 관련
//        int add(int[] arry) {1, 2};
//        int result = add(new int[] {1, 2});
//        // 이것도 new int[] 생략 불가능 하다는데 뭔말인지 모르겟으니 일단 패스

        // 값이 없으면 길이가 0인 배열이 생성된다.
        int[] q = new int[0];
        int[] w = new int[] {};
        int[] e = {};

        // 출력 for문
        int[] jarr = {1, 2, 3, 4};
        for(int j=0; j< jarr.length; j++) {
            System.out.println(jarr[j]);
            // System.out.print(jarr[j]+", ");   줄바꿈이 싫다면 print에 ", "
        }
        
        // 출력 메소드 활용
        // Arrays.toString() 은 import jave.util.*;가 필요하다.
        System.out.println(Arrays.toString(jarr));
        // [1, 2, 3, 4] 와 같은 형식으로 출력된다.

        // 출력 tmi
        System.out.println(jarr);  // [I@ 16진수  = [I 1차원 int 배열, @ 뒤에 내부 주소 // 실행마다 달라질수도.
        // 예외적
        char[] carr = {'a', 'b', 'c', 'd'};
        System.out.println(carr);  // => abcd   println 메서드에서 char 배열일때만 내용이 나온다.

        // 배열 복사
        // tmp = new int[arr.length*2];  더 큰 길이의 배열 생성
        // for { tmp[i] = arr[i] };
        // arr = tmp;  변수 tmp에 저장된 값을 변수 arr에 저장한다,
           // 기존 arr은 사용하지 못하지만, tmp와 arr는 서로 같은 배열을 가르킨다.

        // System.arraycopy()
        // for 대신 더 효율적인 방법
        // for(int i=0; i<num.length; i++) { newNum[i] = num[i]; }
        //
        // System.arraycopy(num, 0, numNum, 0, num.length);
        //                  num[0]에서  numNum[0]으로  num.length개의 데이터 복사.














    }
}
