package 나도코딩.Chap_08;

import 나도코딩.Chap_08.camera.FactoryCam;
import 나도코딩.Chap_08.detector.AdvancedFireDetector;
import 나도코딩.Chap_08.detector.Detectable;
import 나도코딩.Chap_08.detector.FireDetector;
import 나도코딩.Chap_08.reporter.NormalReforter;
import 나도코딩.Chap_08.reporter.Reportable;
import 나도코딩.Chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 추상과는 다르게 인터페이스는 뼈대만 제공하는 느낌
        // 단일상속 (extends) 상속이 하나만 된다는 문제점

        Reportable normalReforter = new NormalReforter();
        normalReforter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();


        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();

    }
}
