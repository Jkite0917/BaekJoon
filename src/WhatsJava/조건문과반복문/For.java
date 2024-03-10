package WhatsJava.조건문과반복문;
import java.util.*;
public class For {
    public static void main(String[] args) {
        System.out.println("test");

        // for 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해 보세요.");
        int number = scanner.nextInt();

        for(int i=0; i<10; i++) {
            if (i == number) {
                System.out.printf("입력한 숫자는 %d 입니다.%n", i);
                break;
            } else if(i == 9 && i != number) {
                System.out.printf("%d, 같은 수가 아닙니다.%n", i);
                System.out.println("입력한 숫자는 한자리 숫자가 아닙니다.");
            } else {
                System.out.printf("%d, 같은 수가 아닙니다.%n", i);
            }
        }

        // for 2 , print
        for (int i=1; i<=5; i++) {
            System.out.println(i);
        }

        for (int i=1; i<=5; i++) {
            System.out.print(i);      // 가로로 출력함. printf와 같이 줄내림 기능 없음.
        }
        System.out.println();

        for (int i=1; i<=5; i++)
            System.out.println(i);

        // for 3 , array for

        int[] arr = {10, 20, 30, 40 ,50};

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }

        // for 3-2 enhanced for statement
        int[] arr2 = {10, 20, 30, 40, 50};

        for (int tmp : arr2) {
            System.out.println(tmp);
            // 간결해지긴 하나 배열이나 컬렉션에 저장된 요소들을 읽어오는 용도로만 사용 가능한 제약.
        }

        // for 4 always true
        for (;;) {

        }
    }
}
