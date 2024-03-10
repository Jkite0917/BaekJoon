package WhatsJava.조건문과반복문;
import java.util.*;
public class DoWhile {
    public static void main(String[] args) {
        System.out.println("test");

        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("1과 100 사이의 정수 입력: ");
            input = scanner.nextInt();

            if(input > answer) {
                System.out.println("더 작은 수로 다시 해보세요.");
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 해보세요.");
            }
        } while (input != answer);     // do while -> do {} 후 while(조건식);

        System.out.println("정답입니다.");
    }
}
