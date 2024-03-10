package 나도코딩.Chap_07_클래스;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지
        // 폴더 구조
        // import 패키지명
        // ex) import chap_07.*   == 07챕에 모든 패키지를 사용한다.

        // 랜덤 클래스 사용해보기
        Random random = new Random();
        //자동으로 import문이 추가됨.
        System.out.println("랜덤 정수 : " + random.nextInt());
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); // 0 이상 10 미만
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 1.0 미만의 실수 값.

        // 5.0 이상 10.0 미만의 실수 뽑기.
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * random.nextDouble()));

        System.out.println("랜덤 boolean : " + random.nextBoolean());

        // 로또 번호 랜덤 뽑기 ( 1 ~ 45 )
        System.out.println("로또 번호 : " + (random.nextInt(45)+1));

        // Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
        // BigInteger, BigDecimal
        // LocalDate, LocalTime, LocalDateTime, DateTimeFormatter, ...
    }

}
