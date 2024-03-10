package 나도코딩.Chap_06_함수;

public class _02_parameter {
    // 전달 값이 있는 메소드
    public static void power(int number) {  // number = Parameter = 매개변수 = 전달값
        int result = number * number;
        System.out.println(number + " ** = " + result);
    }
    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for(int i=0; i<exponent; i++) {
            result *= number;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        // 거듭제곱
        power(2); // = 4
        powerByExp(2, 3); //= 8

    }
}
