package Text;

import java.util.Scanner;

public class Map_1Line {
    public static void main(String[] args) {

        Incheon two = new Incheon();
        two.Open();
        two.Event();
        int select = two.Move();
        two.Choice(select);

    }

    public static class Station {
        protected String name;

        public Station() {
            this("기본값");
        }

        public Station(String name) {
            this.name = name;
        }

        public void Open() {
            System.out.println();
            System.out.println("----------------------------------------");
            System.out.println("현재 1호선에 위치합니다.");
            System.out.println(name + " 역에 도착했습니다. 지도에 추가됩니다.");
            System.out.println();
            //* 지도 활성화
        }

        public void Event() {
            System.out.println("당신은 주의를 살폈다.");
        }

        public int Move() {
            System.out.println();
            System.out.println("어디로 가야할까? (현재 " + name + " 역)");
            int Select = 5;
            return Select;
        }

        public void Choice(int Select) {
            switch (Select) {
                case 1:
                    System.out.println("앞으로 가야 할거같다.");
                    //NextStation += 1;
                    break;
                case 4:
                    System.out.println("뒤로 가야 할거같다.");
                    //NextStation -= 1;
                    break;
                case 2:
                    System.out.println("왼쪽로 가야 할거같다. 환승한다.");
                    //TransStation += 1;
                    break;
                case 3:
                    System.out.println("오른쪽로 가야 할거같다. 환승한다.");
                    //TransStation -= 1;
                    break;
                default:
                case 5:
                    System.out.println("잠깐 생각해보기로 했다.");
            }
        }
    }

    public static class Incheon extends Station {
        public Incheon() {
            super("Incheon");
        }

        @Override
        public void Event() {
            super.Event();
            System.out.println("\"마계의 문\"이 나타났다!");
            System.out.println("\"마계의 문\"이 당신을 집어삼키자 뒤에서 문이 닫히는 소리가 들렸다.");
            System.out.println("뭔진 모르겠으나 아무일 없는 듯 하다.");
        }

        @Override
        public int Move() {
            super.Move();
            Scanner sc = new Scanner(System.in);
            System.out.println("앞: 제물포역 (1) | 뒤: 막혀있는 듯 하다. |\n");
            int Select = sc.nextInt();
            return Select;
        }
    }

    public static class Jemulpo extends Station {
        public Jemulpo() {
            super("Jemulpo ");
        }

        @Override
        public void Event() {
            super.Event();
            System.out.println("비상벨 옆에 검 한 자루가 놓여있다.\n당신은 검을 들었다.");
            System.out.println("\"무난한 검\"을 획득했습니다. ");
        }

        @Override
        public int Move() {
            super.Move();
            Scanner sc = new Scanner(System.in);
            System.out.println("앞: 주안역 (1) | 뒤: 인천역 (4) |\n");
            int Select = sc.nextInt();
            return Select;
        }
    }
}

