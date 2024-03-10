package WhatsJava.조건문과반복문;

public class While {
    public static void main(String[] args) {
        System.out.println("test");

        // while 1
        int i = 0;
        while(i<=10) {
            System.out.println(i);
            i++;
        }
        System.out.println("*********************");

        // while  always true
//        while(true) {
//
//        }

        // while 2
        int j = 5;
        while(j-- != 0) {    // 조건식 자리에 증감을 같이 끼워넣을 수 있음.
            // j-- != 0 과  j != 0 , j--; 는 다른 식이다. (j 값의 변화)
            System.out.println(j);
        }
        System.out.println("*********************");

        // while 3 조건식 유형
        int sum = 0;
        int k = 0;

        while((sum += ++k) <= 100) {   // 메인 조건: sum이 100 이하의 경우 , 서브) k 값을 증가 시켜 sum에 +=
            System.out.printf("%d - %d %n", k, sum);
        }
    }
}
