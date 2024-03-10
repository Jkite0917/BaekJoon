package 나도코딩.Chap_07_클래스.camera;

public final class ActionCam extends Camera {
    
//    public final String lens = "광각 렌즈";
    public final String lens;   //값 초기화는 어디서? 생성자에서
    public ActionCam() {
        super("액션 캠");
        lens = "광각렌즈";  // 생성자
    }
    
    public final void makeVideo() {
        System.out.println(this.name + " : " + this.lens + "로 촬영한 멋진 비디오 제작 중");
    }
}
