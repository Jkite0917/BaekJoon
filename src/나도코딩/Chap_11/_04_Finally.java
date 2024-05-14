package 나도코딩.Chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시 타기");
            throw new Exception("휴무 택시");
        } catch (Exception e) {
            System.out.println("문제: " + e.getMessage());
        } finally {
            System.out.println("택시 문을 닫습니다.");
        }

        // try catch(s)
        // try finally
        // try catch(s) finally
    }
}
