package 나도코딩.Chap_07_클래스;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
//        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color  = "블랙";

        // 어딘가 이상한 할인 행사
        b1.price = -5000;
        System.out.println(b1.price);

        // 고객문의
        System.out.println("해상도 : " +b1.resolution);

        BlackBox b2 = new BlackBox();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");
        System.out.println(b2.getPrice() + b2.getResolution());

    }
}
