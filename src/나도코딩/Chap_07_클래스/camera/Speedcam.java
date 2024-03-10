package 나도코딩.Chap_07_클래스.camera;

public class Speedcam extends Camera { // 자식 클래스

    public Speedcam() {
//        this.name = "과속단속 카메라";
        super("과속 단속 카메라");
    }

    public void takePicture() {
        // 사진 촬영
        super.takePicture();
        checkSpeed();
        recognizeLIcensePlate();
    }
    public void checkSpeed() {
        //속도
        System.out.println("속도 측정");
    }

    public void recognizeLIcensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // annotation
    public void showMainPicture() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
