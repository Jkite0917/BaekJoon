package 나도코딩.Quiz;

import java.util.*;

public class _Quiz_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        int fee = 4000;

        do {
            System.out.println("--------------------");
            System.out.println("주차시간 입력: ");
            String strHour = scanner.nextLine();
            int hour = Integer.parseInt(strHour);

            System.out.println("차량 종류를 선택하세요. (일반: 1, 경차/장애인 차량: 2)");
            int cartype = scanner.nextInt();
            scanner.nextLine();

            int result = fee * hour;

            if(cartype == 1) {
                if(result >= 30000) {
                    result = 30000;
                }
                System.out.println("주차 요금은 " + result + "원 입니다.");
            } else {
                if(result >= 30000) {
                    result = 15000;
                } else {
                    result /= 2;
                }
                System.out.println("주차 요금은 " + result + "원 입니다. 요금 할인이 적용되었습니다.");
            }
            System.out.println("--------------------");

            System.out.println("종료하시겠습니까. (숫자 9)");
            String run = scanner.nextLine();
            if(!run.isEmpty()) {
                int system = Integer.parseInt(run);
                if (system == 9)
                    running = false;
            } else {
                break;
            }
        } while(running);
    }
}
