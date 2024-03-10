package 나도코딩.Quiz;

public class _Quiz_06 {
    public static String getHiddenData(String text, int num) {

        String hiddenText = text.substring(0, num);
//        String hiddenText = Text1.concat(Text2);
        // "*".repeat(100);  11 버전부터 이용 가능한 반복메소드

        for(int i=num; i<text.length(); i++) {
            hiddenText += "*";
        }

        return hiddenText;
    }

    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));

    }
}
