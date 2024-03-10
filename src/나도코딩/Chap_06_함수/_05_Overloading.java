package 나도코딩.Chap_06_함수;

public class _05_Overloading {
    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPower(3));
        System.out.println(getPower("4"));
        System.out.println(getPower(3, 3));

        // 똑같은 이름의 메소드를 여러 번 중복해서 사용하는 것을 메소드 오버로딩
        // 전달값의 타입이 다르거나 전달값의 개수가 서로 다르면
        // 같은 이름의 메소드를 여러번 정의하는 방식으로 해결할 수 있다.
        // 반환형이 다른 경우는 중복 정의가 불가능하다. (전달값만.)
    }
}
