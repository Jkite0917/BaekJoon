package WhatsJava.조건문과반복문;
import java.util.*;

public class If {
    public static void main(String[] args) {
        System.out.println("test");

        // if test1
        int score = 80;

        if (score >= 80) {
            System.out.println("A");
        }
        if (score == 80) System.out.println("A");

        // if test2
        int input;
        System.out.println("숫자 하나 입력해보기: ");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);

        // test2-1  if
        if (input==0) {
            System.out.println("0");
        }

        if (input != 0 )
            System.out.println("0이 아닙니다.");
            System.out.printf("입력한 숫자는 %d 입니다%n", input);  // intentional

        // test2-2 if-else
        if (input == 0) {
            System.out.println("0");
        } else {
            System.out.println("0이 아닙니다.");
        } System.out.printf("입력한 숫자는 %d 입니다%n", input);

        // test2-3 if-else if
        if (input == 0) {
            System.out.println("0 입니다");
        } else if (input >= 10) {
            System.out.println("한 자리 숫자가 아닙니다");
            System.out.printf("입력하신 숫자는 %d 입니다%n", input);
        } else {
            System.out.printf("입력하신 숫자는 %d 입니다%n", input);
        }
    }
}
