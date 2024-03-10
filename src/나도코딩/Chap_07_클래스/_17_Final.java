package 나도코딩.Chap_07_클래스;

import 나도코딩.Chap_07_클래스.camera.ActionCam;
import 나도코딩.Chap_07_클래스.camera.SlowActionCam;

public class _17_Final {
    // Final

    // public (final) class ...
    // public (final) void ...
    // public > abstract > static > final > ...

    public static void main(String[] args) {
        ActionCam actionCam = new ActionCam();
//        actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();

        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.makeVideo();

    }

}
