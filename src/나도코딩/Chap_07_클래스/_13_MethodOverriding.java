package 나도코딩.Chap_07_클래스;

import 나도코딩.Chap_07_클래스.camera.Camera;
import 나도코딩.Chap_07_클래스.camera.FactoryCam;
import 나도코딩.Chap_07_클래스.camera.Speedcam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 덮어쓰기(재정의)
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        Speedcam speedcam = new Speedcam();

        camera.showMainPicture();
        factoryCam.showMainPicture();
        speedcam.showMainPicture();
    }
}
