package 나도코딩.chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name;
        name = "인하공전";
        String test = "테스트변수";

        int hour = 15;

        System.out.println("인하공전 수업이 15시 시작이다.");
        System.out.println("인하공전이 저쩌구 어쩌구");
        System.out.println(name + " 수업이 " + hour + "시 시작이다.");
        System.out.println(test + " 가 어쩌구 저쩌구,");

        double score = 90.5;
        char grade = 'A';  // 한글자에 쓰는 캐릭터는 '작은 따음표'를 사용
        name = "이름";
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격할까요? " + pass);

        double d = 3.1415921234;
        float f = 3.1415921234F;  // 3.14f or 3.14F
        System.out.println(d);   // 3.1415921234
        System.out.println(f);   // 3.141592

        // int i = 100000000000;   // int = -21억 ~ 21억
        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);  // -> 1000000000000

    }
}

/*
String name = "name";
int hour = 10;
double score = 10.5;
char grade = "A";
boolean pass = true; or false;
float f = 3.14f;            // "f or F"
long l = 1000000000000L;     // "L"

double >> float
long >> int

// Variables list
char, String, int, long, float, double, boolean

*/

