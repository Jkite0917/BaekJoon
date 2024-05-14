package 나도코딩.Chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        int age = 17;

        try {
            if(age < 19) {
                throw new Exception("만 19세 이하 구매 불가능");
            } else {
                System.out.println("통과");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
