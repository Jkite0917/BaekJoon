package 나도코딩.Chap_08.reporter;

public class NormalReforter implements Reportable {
    @Override
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다.");
    }
}
