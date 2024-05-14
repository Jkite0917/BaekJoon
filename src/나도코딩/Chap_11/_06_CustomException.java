package 나도코딩.Chap_11;

public class _06_CustomException {
    public static void main(String[] args) {

        int age = 17;

        try {
            if(age < 19) {
                throw new AgeLessThan19Exception("만 19세 이하 구매 불가능");
            } else {
                System.out.println("통과");
            }
        } catch (AgeLessThan19Exception e) {
            System.out.println("나이 미만");
        } catch(Exception e) {
            System.out.println("모든 예외 처리");
        }
    }
}

class AgeLessThan19Exception extends Exception {
    public AgeLessThan19Exception(String message) {
        super(message);
    }
}
