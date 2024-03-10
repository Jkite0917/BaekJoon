package 나도코딩.Chap_07_클래스.camera;

public class FactoryCam extends Camera { // 자식 클래스

    public FactoryCam() {
//        this.name = "공장 카메라";
        super("공장 카메라");
    }

    public void recordVideo() {
        // 동영상 녹화
        super.recordVideo();
        detectFire();
    }

    public void detectFire() {
        System.out.println("화재 감지");
    }

    public void showMainPicture() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
