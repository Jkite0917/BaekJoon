package 나도코딩.Chap_08.detector;

public class AccidentDetector implements Detectable{
    @Override
    public void detect() {
        System.out.println("교통 사고를 감지합니다.");
    }
}
