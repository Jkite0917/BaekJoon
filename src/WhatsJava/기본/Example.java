package WhatsJava.기본;

import java.util.*;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int year = 2023, ages = 20;
        System.out.println(year);
        System.out.println(ages);

        int age = 14;
        System.out.printf("age:%d%n", age);
        System.out.printf("age:%d%n", 14);
        System.out.printf("age:14%n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("정수 입력 테스트: ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력 내용 출력: "+ input);
        System.out.printf("입력 내용 출력: %d%n", num);
    }
}
