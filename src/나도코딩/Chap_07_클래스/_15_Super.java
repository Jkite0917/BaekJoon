package 나도코딩.Chap_07_클래스;

import 나도코딩.Chap_07_클래스.camera.FactoryCam;
import 나도코딩.Chap_07_클래스.camera.Speedcam;

public class _15_Super {
    public static void main(String[] args) {
        // Super
        // 부모 클래스의 어떤 것을 자식 클래스에서 사용하는 역할

        FactoryCam factoryCam = new FactoryCam();
        Speedcam speedcam = new Speedcam();

        factoryCam.recordVideo();
        System.out.println("--------------");
        speedcam.takePicture();
    }


}
