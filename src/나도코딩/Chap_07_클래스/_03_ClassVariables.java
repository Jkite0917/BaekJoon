package 나도코딩.Chap_07_클래스;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";

        // autoreport

        System.out.println("개발 전");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙 박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        // 기능 개발
        BlackBox.canAutoReport = true;
        
        System.out.println("개발 후");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙 박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);
        // 공통적인 적용 요소가 있을 경우 객체.필드가 아닌 클래스.필드를 고려하자.
    }
}
