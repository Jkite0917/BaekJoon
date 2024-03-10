package 나도코딩.Chap_07_클래스;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";  // (최신) 문구 추가 마려움

        b1.appendModelName("(최신형)");
        System.out.println(b1.modelName);

    }
}
