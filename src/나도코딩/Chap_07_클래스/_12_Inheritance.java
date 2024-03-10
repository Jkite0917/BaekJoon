package 나도코딩.Chap_07_클래스;

import 나도코딩.Chap_07_클래스.camera.Camera;
import 나도코딩.Chap_07_클래스.camera.FactoryCam;
import 나도코딩.Chap_07_클래스.camera.Speedcam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속이란

        Camera camera = new Camera();
        FactoryCam factorycam = new FactoryCam();
        Speedcam speedcam = new Speedcam();

        System.out.println(camera.name);
        System.out.println(factorycam.name);
        System.out.println(speedcam.name);

        camera.takePicture();
        factorycam.recordVideo();
        speedcam.takePicture();

        factorycam.detectFire();
        speedcam.checkSpeed();
        speedcam.recognizeLIcensePlate();

    }
}
