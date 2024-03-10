package 나도코딩.Chap_08;

import 나도코딩.Chap_08.camera.Camera;
import 나도코딩.Chap_08.camera.FactoryCam;
import 나도코딩.Chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 (추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)

//        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
//        Camera factoryCam = new FactoryCam(); // 이런 방식으로도 사용은 가능
        SpeedCam speedCam = new SpeedCam();

        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
