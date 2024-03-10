package 나도코딩.Chap_08;

import 나도코딩.Chap_08.camera.SpeedCam;
import 나도코딩.Chap_08.detector.AccidentDetector;
import 나도코딩.Chap_08.reporter.VideoReporter;

public class _Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetecter(new AccidentDetector());
        speedCam.setReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }
}
