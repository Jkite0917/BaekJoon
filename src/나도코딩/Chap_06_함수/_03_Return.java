package 나도코딩.Chap_06_함수;

public class _03_Return {
    // 호텔 프로그램
    // 전화번호, 주소, 활동

    // public static void     void = 반환값이 없는 메소드이다.

    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    public static String getAddress() {
        return "인천 미추홀구 어딘가";
    }

    public static String getActivities() {
        return "볼링, 탁구, 노래";
    }

    public static void main(String[] args) {
        String phoneNumber = getPhoneNumber();
        System.out.println("호텔 전화번호는 : " + phoneNumber);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address);

        System.out.println("호텔 활동: " + getActivities());
    }
}
