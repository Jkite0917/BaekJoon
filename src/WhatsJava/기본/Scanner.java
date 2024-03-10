package WhatsJava.기본;

import java.io.InputStream;

public class Scanner {
    public static void main(String[] args) {
        System.out.println("test");

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String tmp = scanner.nextLine();       // nextLine()
        int tmpint = Integer.parseInt(tmp);   //  nextLine() -> Interger.parseInt();    change int

        int num = scanner.nextInt();            // nextInt() -> scan + int change


    }

}
