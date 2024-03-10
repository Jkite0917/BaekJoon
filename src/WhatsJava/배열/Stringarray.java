package WhatsJava.배열;

public class Stringarray {
    public static void main(String[] args) {
        // string 배열

        String[] array = new String[] {"가", "나", "다"};
        //기본값은 null

        // 정석
        String[] name = new String[3];
        name[0] = new String("kim");
        name[1] = new String("Park");
        //간편
        name[2] = "Yi";

        // 여러 메서드
        String str = "ABCDE";
        char ch = str.charAt(3);  // charAt(index)  한글자 저장하기.

        String str1 = "012345";
        String tmp = str1.substring(1,4); // .substring(index1, index2) 1 ~ 2-1 까지 내용을

        String str2 = "abc";
        if(str2.equals("abc")) {}  // .equals(text) str2와 text가 같은지 확인한다.

        char[] charr = {'A', 'B', 'C'};
        String str6 = new String(charr);  // char[] -> String
        char[] tmp1 = str.toCharArray(); // String -> char[]


    }
}
