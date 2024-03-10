package 나도코딩.Chap_07_클래스;

import 나도코딩.Chap_07_클래스.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Dta Types) : int, float, double, long, boolean, ...
        // 기본 자료형은 소문자로 시작하며 메소드를 가지지 않는다.

        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]);  // 0.0

        //참조 자료형 (Non-Primitive, Reference Data Types)
        // String, camera, FactoryCam, SpeedCam, ...
        // 참조 자료형은 대문자로 시작하며 메소드를 가질 수 있다.

        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);

        c2 = c1;
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);

        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

        /* c1과 c2 는 각각의 new Camera()를 바탕으로 만들어짐. (L.37, 38)
           거기서 L.44에 c2 = c1이라는 코드를 작성함.
           여기서 c2 는 c1을 참조하는게 아니라.
           c1이 가리키는 L.37 new Camera()를 c2는 참조하고 있음.
           고로 L.47에서 c2.name을 수정하게 되면
           c2 는 37 new Camera()의 name을 바꾸게 됨.
           고로 같은 37 new Camera()를 참조하는 c1도
           name이 수정됨.
         */

        /*
        기본 자료형은 = 연산을 할 때 단순히 복사를 해오는 개념이라면
        참조 자료형은 참조하는 원 대상이 달라지는 개념임.
         */

        // 참조 끊는법
//        c2 = null;
//        System.out.println(c2.name);

    }
    public static void changeName(Camera camera) {
        System.out.println("name");
        camera.name = "잘못된 카메라";

    }
}
