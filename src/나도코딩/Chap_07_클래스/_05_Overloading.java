package 나도코딩.Chap_07_클래스;

public class _05_Overloading {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "ㅠ1";

        b1.record(false, false, 10);
        b1.record(true, false, 3);
        b1.record(true, true, 5);

        b1.record();

        // String
        String s = "BlackBox";
        System.out.println(s.indexOf("a"));
    }
}
