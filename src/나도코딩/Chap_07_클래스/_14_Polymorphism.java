package 나도코딩.Chap_07_클래스;


import 나도코딩.Chap_07_클래스.camera.Camera;
import 나도코딩.Chap_07_클래스.camera.FactoryCam;
import 나도코딩.Chap_07_클래스.camera.Speedcam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성
        // SpeedCam, FactoryCam is a Camera (IS-A)


        // class Person : 사람
        // class Student extends Person : 학생   (Student is a person)
        // class Teacher extends Person : 선생님 (Teacher is a person)


//        Camera camera = new Camera();
//        FactoryCam factoryCam = new FactoryCam();
//        Speedcam speedcam = new Speedcam();

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedcam = new Speedcam();

        camera.showMainPicture();
        factoryCam.showMainPicture();
        speedcam.showMainPicture();

        System.out.println("------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new Speedcam();

        for (Camera cam : cameras) {
            cam.showMainPicture();
        }

        System.out.println("------------------");

//        factoryCam.detectFire();
//        speedcam.checkSpeed();

        if (camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }

        if (factoryCam instanceof FactoryCam) {
//            factoryCam.detectFire();
            ((FactoryCam) factoryCam).detectFire();
        }

        if (speedcam instanceof Speedcam) {
            ((Speedcam) speedcam).checkSpeed();
            ((Speedcam) speedcam).recognizeLIcensePlate();
        }

        Object[] objs = new Object[3];
        objs[0] = new Camera();
        objs[1] = new FactoryCam();
        objs[2] = new Speedcam();
    }
}
