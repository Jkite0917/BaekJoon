package 나도코딩.Chap_06_함수;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }

        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("1번 메뉴");
                    break;
                case "2":
                    System.out.println("2번 메뉴");
                    break;
                case "3":
                    System.out.println("3");
                    break;
                default:
                    System.out.println("잘못 입력 함");
            }
        } else {
            System.out.println("1~3 중 하나를 입력하세요");
        }

    }
}
