package TEXT.Line1;

public class CurrentStation {
    public static int CurrentStationId;
    public static int CurrentStationLine;
    public static String CurrentStationName;

    void Open() {
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("당신은 " + CurrentStationName + "역에 도착했다.\n당신은 주의를 살폈다.");
    }

    public void Event() {
        if (Math.random() < 0.7) {
            System.out.println("전투 기능");
            if (Math.random() < 0.4) {
                AfterEvent();
            }
        } else {
            System.out.println("힐 기능");
        }
    }

    void AfterEvent() {
        System.out.println("장비 획득 기능");
    }

    void Move() {
        System.out.println();
        System.out.println("주변을 더 둘러보았지만 특별한건 없는 듯 하다\n" +
                "어디로 가야할까? (현재 " + CurrentStationName + "역)");
    }
}