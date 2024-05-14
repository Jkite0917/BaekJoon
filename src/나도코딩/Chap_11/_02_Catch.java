package 나도코딩.Chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
//            System.out.println(3 / 0);
//
//            int[] arr = new int[3];
//            arr[5] = 100;
//
//            Object obj = "test";
//            System.out.println((int)obj);
            String s = null;
            System.out.println(s);

        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("뭔가 잘못 계산했음. ");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("인덱스 에러");
        } catch (ClassCastException e) {
            System.out.println("형변환 오류");
        }
        catch (Exception e) {
            System.out.println("그 외 에러 낫어요 => " + e.getMessage());
            System.out.println(" // ");
            e.printStackTrace();
        }
    }
}
