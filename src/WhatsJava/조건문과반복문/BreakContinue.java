package WhatsJava.조건문과반복문;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("test");
        int sum=0, i=0;

        while (true) {
            if(sum>100)
                break;
            ++i;
            sum += i;
        }

        System.out.println("i=" + i);
        System.out.println("sum=" + sum);

        for(int j=0; j<=10; j++) {
            if (j%3==0)
                continue;
            System.out.println(j);
        }
    }
}
