package WhatsJava.조건문과반복문;
import java.util.*;

public class RandomWithChar {
    public static void main(String[] args) {

        int randomint = (int) (Math.random() * 100) + 1;
        System.out.printf("%d%n", randomint);

        System.out.println("너의 주민번호는 내 것이다.: ");
        Scanner scanner = new Scanner(System.in);
        String regNo = scanner.nextLine();

        char gender = regNo.charAt(7);  // index number  != 8, == 7

        switch (gender) {    // case range if large, gender +-/* use
            case '1': case '3':
                System.out.println("남자");
                break;
            case '2': case '4':
                System.out.println("여자");
                break;
            default:
                System.out.println("유효하지 않은 주민번호입니다.");

        }
    }
}
