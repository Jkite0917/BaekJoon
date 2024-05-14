package 나도코딩.Chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류,  런타임 오류
        // 컴파일 ->  int i = "문자열";   실행이 안됨
        // 런타임 -> int[] arr = new int[3];,  arr[5] = 100;   실행은 됨
        // 런타임 에러 ( 에러 error,  예외 exception )
        // stackoverflow error ,,,
        // 예외의 경우 코드로 처리가 가능함

        try {
            // System.out.println(3 / 0);
            /*
            int[] arr = new int[3];
            arr[5] = 100;
             */
            Object obj = "test";
            System.out.println((int)obj);

        } catch (Exception e) {
            System.out.println("에러 낫어요 => " + e.getMessage());
            System.out.println(" // ");
            e.printStackTrace();
        }


        System.out.println("정상 종료 확인 구문");


    }
}
