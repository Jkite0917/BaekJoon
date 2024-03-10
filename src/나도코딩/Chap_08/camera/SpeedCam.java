package 나도코딩.Chap_08.camera;

import 나도코딩.Chap_08.detector.Detectable;
import 나도코딩.Chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {
    private Detectable detecter;
    private Reportable reporter;

    public void setDetecter(Detectable detecter) {
        this.detecter = detecter;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect() {
        detecter.detect();
    }

    public void report() {
        reporter.report();
    }
}
